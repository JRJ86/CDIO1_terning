import java.util.Random;
public class Die {

    int faceValue;

    //Die constructor.
    public Die()
    {
        faceValue = 1;
    }
    // Method used to roll a die.
    public void roll()
    {
        Random rand = new Random();
        faceValue = rand.nextInt(6)+1;
    }
    //This method returns the faceValue.
    public int getFaceValue()
    {
        return faceValue;
    }


}

