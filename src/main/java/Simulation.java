import java.util.Arrays;

public class Simulation {

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();

    }
    int numberOfDie;
    int numberOfRolls;
    Integer[] results;

    public Simulation(int numberOfDie, int rolls){
        this.numberOfDie = numberOfDie;
        this.numberOfRolls = rolls;
    }

    public Integer[] runSimulation(){

            Dice simDice = new Dice(this.numberOfDie);
            Bins testBin = new Bins(this.numberOfDie,(this.numberOfDie*6));

        for (int i = 0; i < this.numberOfRolls; i++) {
                int simSum = simDice.tossAndSum();
                testBin.incrementBin(simSum);
            }
        return testBin.sumOfRolls;
    }

    public void printResults() {
        Integer[] results = runSimulation();

        for (int i = 0; i < results.length; i++) {
            int index = i+2;
            int freq = results[i];
            float percent = (float) results[i] / this.numberOfRolls;
            int asterickValue = (int) percent * 100;
            System.out.printf("%2d : %8d : %.2f " + "* \n", index, freq, percent);

            }

    }



}
