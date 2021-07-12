import java.util.*;

public class Simulation {

    private int numberOfDies;
    private int numberOfTosses;

    public Simulation(Integer numberOfDies, Integer numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    public Integer[] runSimulation() {
        Dice die = new Dice(numberOfDies);
        Bins results = new Bins(numberOfDies, numberOfDies * 6);
        for (int i = 0; i < numberOfTosses; i++) {
            int diceRoll = die.tossAndSum();
            results.incrementBin(diceRoll);
        }
        return results.diceRolls;
    }

    public void printResults() {
        Integer[] diceRolls = runSimulation();
        StringBuilder builder = new StringBuilder();
        System.out.printf("***\nSimulation of %s dice tossed for %s times.\n***\n\n", numberOfDies, numberOfTosses);
        for (int i = 0; i < diceRolls.length; i++) {
            for (int j = 0; j < (diceRolls[i] / numberOfTosses) * 100; i++) {
                builder.append("*");
            }
            System.out.printf("%s :   %s:  %.2f  %s\n", i + numberOfDies, diceRolls[i], (double)diceRolls[i] / numberOfTosses, builder.toString());
            builder.delete(0, builder.length());
        }
    }

    public Integer getNumberOfDies() {
        return numberOfDies;
    }

    public Integer getNumberOfTosses() {
        return numberOfTosses;
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000);
        simulation.printResults();
    }
}
