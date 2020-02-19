import java.util.HashMap;
import java.util.Map;

public class Simulation {

    private Integer numberOfDice;
    private Integer numberOfTosses;
    private Integer binLow;
    private Integer binHigh;
    private Integer result = 0;
    private Bins bin;

    public Simulation(Integer noDice, Integer noTosses) {
        this.numberOfDice = noDice;
        this.numberOfTosses = noTosses;
        this.binHigh = numberOfDice * 6;
        this.binLow = numberOfDice;
        this.bin = new Bins(binLow, binHigh);
    }

    public void runSimulation() {
        Dice die = new Dice(this.numberOfDice);
        for (int i = 0; i < this.numberOfTosses; i++) {
            this.bin.incrementBin(die.tossAndSum());
        }
    }

    public void printResults() {
        String topLine = "***\nSimulation of " + this.numberOfDice + " dice tosses for " + this.numberOfTosses + " times.\n***\n";
        String allResults = "";
        int sumOfResults = bin.sumOfResults();

        for (int i = binLow; i < binHigh + 1; i++) {
            float percen = (float)bin.getBin(i) / this.numberOfTosses;
            allResults += "" + i + " : " + bin.getBin(i) + ": " + String.format("%.2f", percen) + " **\n";
        }

        System.out.println(topLine);
        System.out.println(allResults);
    }

}
