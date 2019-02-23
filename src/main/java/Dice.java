
import java.util.Random;


public class Dice {

    int num;



    public Dice(int num) {
        this.num = num;
    }

    public Integer tossAndSum() {
        Integer diceResult  = 0;
        int i=0;
        do {
            Random random = new Random();
            Integer randomNum = random.nextInt(6)+1;

            diceResult += randomNum;
            i++;
            }
            while (i <num);



        return diceResult;
    }
}
