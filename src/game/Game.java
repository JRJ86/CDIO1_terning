package game;

public class Game {
    public static void main(String[] args){

        Die d1 = new Die();
        Die d2 = new Die();

        Player p1 = new Player();
        Player p2 = new Player();

        while (p1.getPoints()<40 && p2.getPoints()<40) {
            System.out.println();
            //game.Player 1
            System.out.println("Current points for player one: "+p1.getPoints());


            d1.roll();
            d2.roll();

            p1.addPoints(d1.getFaceValue() + d2.getFaceValue());


            System.out.println("Dice rolled: "+d1.getFaceValue() + " and " + d2.getFaceValue());


            System.out.println("Points after roll for player one: "+p1.getPoints());

            //game.Player 2
            System.out.println();
            System.out.println("Current points for player two: "+p2.getPoints());


            d1.roll();
            d2.roll();

            p2.addPoints(d1.getFaceValue() + d2.getFaceValue());


            System.out.println("Dice rolled: "+d1.getFaceValue() + " and " + d2.getFaceValue());


            System.out.println("Points after roll for player two: "+p2.getPoints());

        }
        System.out.println();
        System.out.println("TIME TO FIND OUT WHO BITES THE DUST BITCHES");
        System.out.println("game.Player one has: " + p1.getPoints() + " point and player two has: " + p2.getPoints() + " points");
        System.out.println("WHICH FUCKING MEANS!!!!!");
        if (p1.getPoints()>p2.getPoints()){
            System.out.println("game.Player one OWNS player two SUCKA");
        } else if (p1.getPoints()<p2.getPoints()){
            System.out.println("game.Player two PWNS player one SUCKA");
        } else {
            System.out.println("game.Player one and player two are equals... pussies");
        }

    }
}
