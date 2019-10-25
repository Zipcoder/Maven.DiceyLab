package diceylab;

import java.util.Arrays;

public class Simulation {
    private int numberOfDice;
    private int numberOfTosses;
    // Constructor
    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
    }
    public void runSimulation() {
        Dice dice = new Dice(numberOfDice);
//        Bins bins = new Bins(numberOfDice, (numberOfDice * 6));
        Integer[] rolls = new Integer[(numberOfDice * 6)+1];
        for (int i = 0; i < numberOfTosses; i++) {
            int rollValue = dice.rollDice(); // should be numberOfDice < rollValue < numberOfDice*6
            if (rolls[rollValue] == null) {
                rolls[rollValue] = 0;
            }
//            System.out.println(Arrays.toString(rolls));
            rolls[rollValue] += 1; // incrementBin(dice.rollDice());
        }
        System.out.println(Arrays.toString(rolls));
    }
    public void printResults() {

    }

}
