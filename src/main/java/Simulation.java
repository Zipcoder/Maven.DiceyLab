import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulation {
    private static Logger logger = Logger.getLogger("Dice");

    private static int noOfRolls;
    private static int noOfDice;


    public Simulation(int noOfDice, int noOfRolls) {
        this.noOfDice = noOfDice;
        this.noOfRolls = noOfRolls;
    }
    Dice dice = new Dice(noOfDice);
    Bins bin = new Bins(noOfDice,noOfRolls);

    public int runSimulation(){
        for (int i = 0; i < noOfRolls; i++) {
            int currentThrow = dice.tossAndSum();
            bin.incrementBin(currentThrow);
            logger.log(Level.INFO,"Result of rolling " + noOfDice+ " dice = " + currentThrow);
        }
        return bin.getBin(6);
    }


}
