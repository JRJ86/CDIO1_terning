package game;

public class DiceCup {
    Die dice1 = new Die();
    Die dice2 = new Die();
    int totalValue;

    public void roll(){
        dice1.roll();
        dice2.roll();
        totalValue= dice1.getFaceValue()+dice2.getFaceValue();
    }

    public Die getDice1() {
        return dice1;
    }

    public Die getDice2() {
        return dice2;
    }

    public int getTotalValue() {
        return totalValue;
    }
}
