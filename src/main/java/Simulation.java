import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulation {
    private static Logger logger = Logger.getLogger("Dice");

    private static int noOfRolls;
    private static int noOfDice;
    Dice dice;
    Bins bin;

    public Simulation(int noOfDice, int noOfRolls) {
        this.noOfDice = noOfDice;
        this.noOfRolls = noOfRolls;
        this.dice = new Dice(noOfDice);
        this.bin  = new Bins(noOfDice,noOfRolls);
    }


    public void runSimulation(){
        for (int i = 0; i < noOfRolls; i++) {
            int currentThrow = dice.tossAndSum();
            this.bin.incrementBin(currentThrow);
        }
    }

    public double getPercentage(int number){
        return (number + .00d)/(noOfRolls + .00d);
    }
//    Simulation of 2 dice tossed for 1000000 times.
    public void printResults(){
        String intro = String.format("***%nSimulation of %d dice tossed for %d times.%n***",noOfDice,noOfRolls);
        System.out.println(intro);

        int range = (noOfDice*6) + 1;
        for (int i = 2; i <= range; i++) {
            int binContents = bin.getBin(i);
            double percentage = getPercentage(binContents);
            String dataForCurrentValue = String.format("%2d:%15d:  %.2f",i,binContents,percentage);
            System.out.println(dataForCurrentValue);
        }
    }
}
