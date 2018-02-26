
import java.util.Random;

public class Dice
{
    public int numberofDies;

    public Dice(int numberofDies)
    {
        this.numberofDies = numberofDies;
    }

    public Integer tossAndSum()
    {
        Random random = new Random();

        Integer sumOfToss = 0;

        for (int i = 0; i < numberofDies; i ++)
        {
            sumOfToss += random.nextInt(6) + 1;
        }

        return sumOfToss;
    }
}
