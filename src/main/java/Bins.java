import java.util.logging.Level;
import java.util.logging.Logger;

public class Bins {
    private static Logger logger = Logger.getLogger("Bins");
    private int rollTracker[];
    private int noOfDice;
    private int noOfRolls;

    public Bins(int noOfDice, int noOfRolls) {
        this.noOfDice = noOfDice;
        this.noOfRolls = noOfRolls;
        this.rollTracker = new int[(noOfDice*6)+1];
    }


    public void incrementBin(int num){
        rollTracker[num] += 1;
    }


    public int getBin(int val) {
        return rollTracker[val];
    }
}
