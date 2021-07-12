public class Simulation {
    private Integer numberOfDice;
    private Integer numberOfTosses;




    public Simulation(Integer numberOfDice, Integer numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
    }

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 10000);
        simulation.printResults(simulation.runSimulation());
    }

    private Bins runSimulation() {
        Dice dice = new Dice(numberOfDice);
        Integer maxValue = numberOfDice * 6;
        Bins bin = new Bins(numberOfDice, maxValue);
        for (int i = 0; i < numberOfTosses; i++) {
            bin.incrementBin(dice.tossAndSum());//increments to random numbers between start and end
        }
        return bin;
    }
    private void printResults(Bins bin) {
        Integer maxValue = numberOfDice * 6;
        //loop through results array and divide by the total number of tosses
        for (int i = numberOfDice; i <= maxValue ; i++) {
            System.out.print(String.format("%2d : %4d : %1.2f    ", i, bin.getBin(i), binPercent(bin.getBin(i))));
            printStars(binPercent(bin.getBin(i)));
            System.out.println();
        }
    }
    public void printStars(Double value) {
        int numberOfStars = (int) (value * 100);
        for (int i = 1; i <= numberOfStars; i++) {
            System.out.print("*");
        }
    }

    public double binPercent(Integer value) {
        return Double.valueOf(value) / numberOfTosses;
    }




}
