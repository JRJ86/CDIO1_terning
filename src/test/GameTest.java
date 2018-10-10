package test;

import game.DiceCup;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

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
        int die1Value = 0;
        int die2Value = 0;
        int dieTotalValue = 0;

        // Test
        for( int i=0; i< NUMBEROFROLLS; i++){
            diceCup.roll();
            die1Value = diceCup.getDice1().getFaceValue();
            die2Value = diceCup.getDice2().getFaceValue();
            dieTotalValue = die1Value + die2Value;
            assertEquals(dieTotalValue, diceCup.getTotalValue());
        }
    }

    /** Requirement 2.2
     *
     * @author Andreas and Malte
     * Testing that the DiceCup works for 1000 rolls, and gives the right total value back.
     */

    //@Test
    /*void DiceCupValueDistributionTest(){
        // Settings
        final int NUMBEROFTHROWS = 10000;
        final double ALLOWEDDEVIATION = 0.05; // The allowed deviation for values

        // Setup - setting up some test numbers
        int[] occurence = new int[11]; // 0=2, 10=12
        int instancesOfEach = NUMBEROFTHROWS/12; // Number of times each value should appear
        //int deviationNumber = (int) ((double)instancesOfEach*deviationPercent);
        int highBound = instancesOfEach+deviationNumber;
        int lowBound  = instancesOfEach-deviationNumber;

        // Setup


        // Test
        for

        // Result Printing

    }


    void diceRatioTest(){

        // Setting up test numbers
        int numberOfThrows = 1000000;
        double deviationPercent = 0.01; // The allowed deviation before the test fails
        int instancesOfEach = numberOfThrows/6;
        int deviationNumber = (int) ((double)instancesOfEach*deviationPercent);
        int highBound = instancesOfEach+deviationNumber;
        int lowBound  = instancesOfEach-deviationNumber;

        // Setting up test variables
        Die die = new Die();
        ArrayList<Integer> valueInstanc = new ArrayList<Integer>();
        valueInstanc.add(0);
        valueInstanc.add(0);
        valueInstanc.add(0);
        valueInstanc.add(0);
        valueInstanc.add(0);
        valueInstanc.add(0);

        // Running Tests
        int dieValue = 0;
        for(int i=0;i<numberOfThrows;i++){
            dieValue = die.roll();
            valueInstanc.set(dieValue-1, valueInstanc.get(dieValue-1)+1);
        }

        System.out.println("Face instances has to be between "+lowBound+" and  "+highBound);

        // Printing results
        int dieThrows = 0;
        for(int i=0; i<6; i++){
            dieThrows += valueInstanc.get(i);
            System.out.println("Face "+(i+1)+" instances: "+valueInstanc.get(i));
        }

        // Checking tests
        assertTrue(numberOfThrows==dieThrows);
        for(int i=0; i<6; i++){
            assertTrue(valueInstanc.get(i)>=lowBound && valueInstanc.get(i)<=highBound);
        }*/
    //}
}
