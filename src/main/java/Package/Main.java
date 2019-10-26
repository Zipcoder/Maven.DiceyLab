package Package;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){
        Dice dice = new Dice(2);
        Integer toss;

        Bins results = new Bins(2,12);
        for(int i = 0; i < 100; i++){
            toss = 0; //Sets toss back to zero before new roll
            for (int j =0; j <dice.numberOfDice;j++) {
                System.out.println("Roll # " + i);
                toss += dice.tossAndSum();
            }
            results.incrementBin(toss);
        }
        for(int i =results.min; i <= results.max;i++){
            results.getBin(i);
        }
    }


}
