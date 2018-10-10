package game;
import java.util.Scanner;

public class Game {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DiceCup diceCup = new DiceCup();
        Player player1 = new Player();
        Player player2 = new Player();


        // Run Game
        System.out.println("Welcome to the Dice Game!");
        System.out.println();
        System.out.println("Press '1' or '2' for rolling the dice for either Player 1 or Player 2");

        // Main Game Loop
        while (player1.getPoints()<40 && player2.getPoints()<40) {
            System.out.println();

            // Requesting input
            System.out.println("Roll the dice: ");
            int input = scanner.nextInt();

            switch (input) {

                case (1): {
                    // Player 1

                    System.out.println("Current points for Player 1: " + player1.getPoints());

                    diceCup.roll();
                    System.out.println("Player 1 rolled: " + diceCup.getDice1().getFaceValue() + " and " + diceCup.getDice2().getFaceValue());

                    player1.addPoints(diceCup.totalValue);
                    System.out.println("Points after roll for Player 1: " + player1.getPoints());

                    break;
                }
                case (2): {
                    // Player 2

                    System.out.println("Current points for Player 2: " + player2.getPoints());

                    diceCup.roll();
                    System.out.println("Player 2 rolled: " + diceCup.getDice1().getFaceValue() + " and " + diceCup.getDice2().getFaceValue());

                    player2.addPoints(diceCup.totalValue);
                    System.out.println("Points after roll for Player 2: " + player2.getPoints());

                    break;
                }
                default: {
                    // Wrong input
                    System.out.println("Woops - wrong input, please try again...");
                }
            }
        }

        // Some one reached 40 points
        System.out.println();
        System.out.println("Someone reached 40 points - time to find the winner!");
        System.out.println("Player 1 has: " + player1.getPoints() + " points and Player 2 has: " + player2.getPoints() + " points");
        System.out.println();

        if (player1.getPoints()>player2.getPoints()){
            System.out.println("Player 1 wins!!");
        } else if (player1.getPoints()<player2.getPoints()){
            System.out.println("Player 2 wins!!");
        } else {
            System.out.println("It's a tie!");
        }

        System.out.println();
        System.out.println("Thank you for playing!");
        
        scanner.close();
    }
}
