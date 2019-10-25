package Package;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    public int numberOfRolls;
    public int numberOfDice;
    public int min = 2;
    public int max = 6;
    public int total;
    public Dice (int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum(){
//            total += ((int) (Math.random() * max) + min);
           int total = ThreadLocalRandom.current().nextInt(min,max+1);
            System.out.println("Printing from toss and sum " + total);
        return total;
    }
}
