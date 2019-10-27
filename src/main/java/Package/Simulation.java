package Package;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Simulation {
    Integer numberOfDice;
    Integer numberOfRolls;

    public Simulation(){};
    public Simulation(Integer numberOfDice, Integer numberOfRolls){
        this.numberOfDice = numberOfDice;
        this.numberOfRolls = numberOfRolls;
    }
    Bins results = new Bins(2,12);

    void runSimulation(){
        Dice dice = new Dice(2);
        Integer toss;

        for(int i = 0; i < numberOfRolls; i++){
            toss = 0; //Sets toss back to zero before new roll
            for (int j =0; j <dice.numberOfDice;j++) {
                toss += dice.tossAndSum();
            }
            results.incrementBin(toss);
        }
    }

    void printSimulation(){
        String header = "***";
        System.out.println(header +"\n" + this.getClass().getCanonicalName() + " of " + numberOfDice + " dice tossed for " + numberOfRolls + " times.\n" + header +"\n");
        for(int i =results.min; i <= results.max;i++){
            StringBuilder star = new StringBuilder();
            for(double j = 0.01; j < (double) results.getBin(i) / numberOfRolls; j+=.01) {
                star.append("*");
            }
                System.out.printf("%2d%2s%10d%-4s%-5.2f%s%n", i, ":", results.getBin(i), ":", (double) results.getBin(i) / numberOfRolls,star.toString());//yikes!
        }
    }


}
