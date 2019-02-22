
import java.util.Random;


public class Dice {

    int num;

    public Dice() {
        this.num = num;

    }

    public Dice(int num) {
        this.num = num;
    }

    public Integer tossAndSum() {
        Integer sum  = 0;
        int i=0;
        do {
            Random random = new Random();
            Integer randomNum = random.nextInt(7);
            System.out.println(randomNum);
            if(randomNum==0){
                randomNum=randomNum+1;
            }
//            System.out.println("Random number  " + randomNum + "mas i" + i);
            sum += randomNum;
            i++;
            }
            while (i <num);


        System.out.println("suma  "+sum );

        return sum;
    }
}
