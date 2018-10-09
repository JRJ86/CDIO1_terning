package game;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){

        DiceCup diceCup = new DiceCup();

        Player p1 = new Player();
        Player p2 = new Player();
        System.out.println("Press '1' or '2' for rolling the dice for either player one or player two");
        Scanner hej = new Scanner(System.in);
        while (p1.getPoints()<40 && p2.getPoints()<40) {
            System.out.println();
            //Player 1
            int input = hej.nextInt();
            switch (input) {
                case (1): {
                    System.out.println("Current points for player one: " + p1.getPoints());
                    diceCup.roll();

                    p1.addPoints(diceCup.totalValue);


                    System.out.println("Dice rolled: " + diceCup.getDice1().getFaceValue() + " and " + diceCup.getDice2().getFaceValue());


                    System.out.println("Points after roll for player one: " + p1.getPoints());

                    //Player 2
                    System.out.println();

                    break;
                }
                case (2): {
                    System.out.println("Current points for player two: " + p2.getPoints());
                    diceCup.roll();

                    p2.addPoints(diceCup.totalValue);


                    System.out.println("Dice rolled: " + diceCup.getDice1().getFaceValue() + " and " + diceCup.getDice2().getFaceValue());


                    System.out.println("Points after roll for player two: " + p2.getPoints());
                    break;
                }
                default: {
                    System.out.println("nonononononono bad boy");
                }

            }
        }
        System.out.println();
        System.out.println("TIME TO FIND OUT WHO BITES THE DUST BITCHES");
        System.out.println("Player one has: " + p1.getPoints() + " point and player two has: " + p2.getPoints() + " points");
        System.out.println("WHICH FUCKING MEANS!!!!!");
        if (p1.getPoints()>p2.getPoints()){
            System.out.println("Player one OWNS player two SUCKA");
        } else if (p1.getPoints()<p2.getPoints()){
            System.out.println("Player two PWNS player one SUCKA");
        } else {
            System.out.println("Player one and player two are equals... pussies");
        }
        hej.close();
    }

}
