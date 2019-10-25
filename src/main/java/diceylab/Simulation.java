package diceylab;

import java.util.Arrays;

public class Simulation {
    private int numberOfDice = 2;
    private int numberOfTosses = 1000000;
    private int max;
    // Constructor
    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.max = numberOfDice*6;
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 10000000);
        Bins bins = sim.runSimulation();
        sim.printResults(bins);

    }

    public Bins runSimulation() {
        Dice dice = new Dice(numberOfDice);
        Bins bins = new Bins(numberOfDice);
        for (int i = 0; i < numberOfTosses; i++) {
            int rollValue = dice.rollDice(); // should be numberOfDice < rollValue < numberOfDice*6
            bins.incrementBin(rollValue);
        }
        return bins;
    }


    public Double[] normalizeResults(Bins bins) {
        Double[] normalizedRolls = new Double[max+1];
        int total = getTotal(bins.getBinsArray());
        for (int i = 0; i <= max; i++) {
            if (bins.getBin(i) != null) {
                normalizedRolls[i] = ((double) bins.getBin(i)) / total;
            }
        }
        return normalizedRolls;
    }

    public String printResults(Bins bins) {
        Double[] normalizedRolls = normalizeResults(bins);
        StringBuilder message = new StringBuilder();
        message.append(String.format("***\nSimulation of %s dice tossed for %s times\n***\n", numberOfDice, numberOfTosses));
        for (int i = 0; i <= (numberOfDice*6); i++) {
            if (bins.getBin(i) != null) {
                message.append(String.format("%s\t: %8s : %8.2f\t%s\n", i, bins.getBin(i), normalizedRolls[i], getStars(normalizedRolls[i])));
            }
        }
        System.out.print(message.toString());
        return message.toString();
    }

    public String getStars(double normVal) {
        int numStars = (int) (normVal * 100);
        StringBuilder stars = new StringBuilder();
        for (int i = 0; i < numStars; i++) {
            stars.append("*");
        }
        return stars.toString();
    }

    public Integer getTotal(Integer[] rollCount) {
        int total = 0;
        for (int i = 0; i < rollCount.length; i++) {
            if (rollCount[i] != null) {
                total += rollCount[i];
            }
        }
        return total;
    }

}
