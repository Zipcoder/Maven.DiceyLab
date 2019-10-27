package Package;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
//    public int numberOfRolls = 10;
    public int numberOfDice;
    public int min = 1;
    public int max = 6;
    public int total;
    public Dice (int numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum(){
//            total += ((int) (Math.random() * max) + min);
           Integer total = ThreadLocalRandom.current().nextInt(min,max+1);
//            System.out.println("Printing from toss and sum " + total + "\n");
        return total;
    }

}
