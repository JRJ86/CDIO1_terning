public class Game {
    public static void main(String[] args){

        Die d1 = new Die();
        Die d2 = new Die();

        Player p1 = new Player();
        Player p2 = new Player();

        System.out.println(p1.getPoints());


        d1.roll();
        d2.roll();

        p1.addPoints(d1.getFaceValue()+d2.getFaceValue());


        System.out.println(d1.getFaceValue()+ " og " +d2.getFaceValue());


        System.out.println(p1.getPoints());







    }
}
