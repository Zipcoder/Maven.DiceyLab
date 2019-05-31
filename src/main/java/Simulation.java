public class Simulation {

    public Integer numberOfDice;
    public Integer numberOfTosses;
    public Dice dice;
    public Bins results;

    public Simulation(Integer numberOfDice, Integer numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.results = new Bins(numberOfDice, Math.multiplyExact(6, numberOfDice));
        this.dice = new Dice(numberOfDice);
    }


    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            Integer sum = dice.tossAndSum();
            results.incrementBin(sum);
        }
    }

    public void printResults() {
        System.out.println("***");
        System.out.printf("Simulation of %d dice tossed for %d times.\n", numberOfDice, numberOfTosses);
        System.out.println("***");

        String asterisks = "******************";
        for (int i = numberOfDice; i <= 6*numberOfDice; i++) {
            int total = results.getSums()[i];
            double ratio = (double)total/(double)numberOfTosses;
            String s = asterisks.substring(18-Math.floorDiv(total,10000));
            System.out.printf("%2d : %9d : %.2f %-16s\n", i, total, ratio, s);
        }

    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        sim.printResults();
    }


}
