import java.util.Arrays;

public class Simulation {

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
    }

    int numberOfDice;
    int numberOfRolls;
    Integer[] results;

    public Simulation(int numberOfDice, int numberOfRolls) {
        this.numberOfDice = numberOfDice;
        this.numberOfRolls = numberOfRolls;
    }

    public Integer[] runSimulation() {

        Dice testDice = new Dice(numberOfDice);
        Bins testBin = new Bins(numberOfDice, numberOfDice * 6);

        for (int i = 0; i < numberOfRolls; i++) {
            int toss = testDice.tossAndSum();
            testBin.incrementBin(toss);
        }
        return testBin.sumOfRolls;
    }

    private void printResults() {
        Integer[] results = runSimulation();
        System.out.println("~*~*~*~*~*~*~~*~*~~*~*~~*~*~~*~*~~*~*~~*~*~~*~*~\n"
                + "Simulation of 2 dice tossed for 1,000,000 times\n"
                + "~*~*~*~*~*~*~~*~*~~*~*~~*~*~~*~*~~*~*~~*~*~~*~*~");
        for(int i = 0; i < results.length; i++) {
            int index = i + 2;
            int frequency = results[i];
            float percent = (float) results[i] / this.numberOfRolls;
            int starValue = (int) (percent * 100);
            System.out.printf("%2d : %8d : %.2f ", index, frequency, percent);
            for (int j = 0; j < starValue; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
