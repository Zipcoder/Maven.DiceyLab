import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Simulation {

    private Integer numberOfDice;
    private Integer numberOfTosses;
    private Integer binLow;
    private Integer binHigh;
    private Integer result = 0;
    private Bins bin;
    private static Logger log = Logger.getLogger(Simulation.class.getName());

    public Simulation(Integer noDice, Integer noTosses) {
        this.numberOfDice = noDice;
        this.numberOfTosses = noTosses;
        this.binHigh = numberOfDice * 6;
        this.binLow = numberOfDice;
        this.bin = new Bins(binLow, binHigh);
    }

    public void runSimulation(boolean useSeed) {
        Dice die;
        if (useSeed) {
            die = new Dice(this.numberOfDice, new Long(4));
        } else {
            die = new Dice(this.numberOfDice);
        }
        for (int i = 0; i < this.numberOfTosses; i++) {
            this.bin.incrementBin(die.tossAndSum());
        }
    }

    public ArrayList<Integer> getAllResults() {
        ArrayList<Integer> resultsByValue = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : this.bin.getMap().entrySet()) {
            resultsByValue.add(entry.getValue());
        }
        return resultsByValue;
    }

    public String printResults() {
        String topLine = "\n***\nSimulation of " + this.numberOfDice + " dice tosses for " + this.numberOfTosses + " times.\n***\n";
        String allResults = "";

        for (int i = binLow; i < binHigh + 1; i++) {
            float percen = (float)bin.getBin(i) / this.numberOfTosses;
            int numStars = bin.getBin(i) / 10000;
            String endStars = " ";

            for (int j = 0; j < numStars; j++) {
                endStars += "*";
            }
            //endStars += "\n";
            allResults += String.format("%3d  : %6d : %.2f : %s\n", i, bin.getBin(i), percen, endStars);
        }

        log.info(topLine + allResults);
        //System.out.println(topLine);
        //System.out.println(allResults);

        return allResults;
    }

}
