package Package;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public int numberOfDice;
    public int min = 1;
    public int max = 6;
    public Dice (int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum(){
//            total += ((int) (Math.random() * max) + min);
           Integer total = ThreadLocalRandom.current().nextInt(min,max+1);
        return total;
    }

}
