public class Game {
    public static void main(String[] args){

        Die d1 = new Die();
        Die d2 = new Die();

        d1.roll();
        d2.roll();

        System.out.println(d1.getFaceValue()+ " og " +d2.getFaceValue());

    }
}
