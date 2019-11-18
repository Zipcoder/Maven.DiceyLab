package rocks.zipcode;

import rocks.zipcode.Bins;
import rocks.zipcode.Dice;

public class Simulation {
    Bins diceTable;
    int numberOfDice, numberOfRolls;

    public Simulation(int x, int y) {
        numberOfDice = x;
        numberOfRolls = y;

    }

    public void runSimulation() {
        Dice dice = new Dice(numberOfDice);
        diceTable = new Bins(numberOfDice * 6 + 1);
        for (int i = 0; i <= numberOfRolls; i++) {

            diceTable.incrementBin(dice.tossAndSum());

        }
    }

    public int getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public void printResults() {
        StringBuilder sb = new StringBuilder();
        System.out.println("*** \n" +
                "rocks.zipcode.Simulation of " + numberOfDice + "dice tossed for " + numberOfRolls + "times.\n" +
                "***\n");

        for (int i = 0; i <= numberOfDice * 6; i++) {
            System.out.printf("%2d %s %6d %s %1.2f %s", i, " :", diceTable.getBins(i), ": ", (float) diceTable.getBins(i) / (float) numberOfRolls, " ");

            for (int j = 0; j < ((float)diceTable.getBins(i)/(float)numberOfRolls)*100; j++){
                System.out.print("*");
            }

            System.out.println();
        }


    }
}





