package test;

import game.DiceCup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameTest {


    /** Test of requirement 1.1 (see documentation)
     *  @author Andreas and Malte
     *  Testing that the DiceCup works for 1000 rolls, and gives the right total value back.
     */
    @Test
    void DiceCupTest(){
        // Settings
        final int NUMBEROFROLLS = 1000;

        // Setup
        DiceCup diceCup = new DiceCup();
        int die1Value;
        int die2Value;
        int dieTotalValue;

        // Test
        for( int i=0; i< NUMBEROFROLLS; i++){
            diceCup.roll();
            die1Value = diceCup.getDice1().getFaceValue();
            die2Value = diceCup.getDice2().getFaceValue();
            dieTotalValue = die1Value + die2Value;
            assertEquals(dieTotalValue, diceCup.getTotalValue());
        }
    }

    /** Requirement 2.2 - DiceCup Sum Probability Test
     *
     * @author Andreas and Malte
     * Testing that the probability of the different totalValues (2, 3 ... 12)
     * of the DiceCup are matching the the mathematical probability.
     *
     * Test numbers:
     *  - It tests each value's occurence after NUMBEROFTHROWS throws
     *  - The value is allow to deviate by +- ALLOWEDDEVIATION decimal percent
     *  - Source for the mathematicla probability of values on a pair of dice: https://wizardofodds.com/gambling/dice/
     */
    @Test
    void DiceCupValueDistributionTest(){

        // Settings
        final int       NUMBEROFTHROWS      = 100000;
        final double    ALLOWEDDEVIATION    = 0.05; // The allowed deviation from the intended probability of values
        final double[]  PROBABILITIES       = {0.0278, 0.0556, 0.0833, 0.1111, 0.1389, 0.1667, 0.1389, 0.1111, 0.0833, 0.0556, 0.0278};
            // list index 0 equals to the sum of values on the dice 2, and 10 equals to 12.

        // Setup
        int[] occurences = new int[11]; // 0=2, 10=12
        DiceCup diceCup = new DiceCup();

        // Acting
        for( int i=0; i<NUMBEROFTHROWS; i++) {
            diceCup.roll();
            int value = diceCup.getTotalValue();
            occurences[value-2]++; }

        // Checking results
        for( int index=0; index<occurences.length; index++){
            int occurence = occurences[index];
            double value_exactExpectedOccurence = NUMBEROFTHROWS * PROBABILITIES[index];
            int value_highBound = (int)(value_exactExpectedOccurence*(1+ALLOWEDDEVIATION));
            int value_lowBound = (int)(value_exactExpectedOccurence * (1-ALLOWEDDEVIATION));

            // Prints the result to the console, including the intended highbound and lowbound values.
            System.out.println("Value "+(index+2)+": "+"\t"+occurence+" \t("+value_lowBound+"-"+value_highBound+")");
            assertTrue( occurence>= value_lowBound && occurence<=value_highBound); }

    }
}
//Vi tester at den nu bliver opdateret
