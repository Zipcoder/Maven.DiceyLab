import java.util.List;

public class Simulation {
    public static void main(String[] args) {
        runSimXTimes(2, 1000000);

    }

    public static void runSimXTimes(Integer numberOfDice, Integer numberOfTosses){
        Dice testDice = new Dice(numberOfDice);
        Bins testBin = new Bins(testDice.getNumberOfDice(), testDice.getNumberOfDice() * 6);
        testDice.initializeDiceList();

        for(int i = 0; i < numberOfTosses; i++){
            testBin.incrementBin(testDice.tossAndSum());
        }
        testBin.printResults(numberOfTosses);
        System.out.println("testline");

    }


}
