import java.util.Random;
public class Dice
{
  /*  Random rand = new Random();
    int rand_int1 = rand.nextInt(6);
    int rand_int2 = rand.nextInt(6); */

    private  static final  int  MAX=6;

    private Integer numberOfRolls;
    private Integer tossSum;

    public Dice(Integer numberOfRolls) {
        this.numberOfRolls = numberOfRolls;
    }



    public Integer tossAndSum()
    {
        Integer tossSum =0;
        for (int i=0; i< numberOfRolls; i++) {

            tossSum += (int) (Math.random() * MAX) + 1;
        }
        return tossSum;
    }

}
