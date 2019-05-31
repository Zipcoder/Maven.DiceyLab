public class Simulation {

    private Integer numberOfDice;
    private Integer numberOfTosses;
    private Bins bins;
    private Dice dice;

    public Simulation(Integer numberOfDice, Integer numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        dice = new Dice(numberOfDice);
        bins = new Bins(numberOfDice, numberOfDice*6);
    }

    public void runSimulation() {
        for(Integer n = 0; n < numberOfTosses; n++)
            bins.incrementBin(dice.tossAndSum());

    }

    public void printResults() {
        System.out.println("***");
        System.out.printf("Simulation of %d dice tossed for %d times.\n",
                numberOfDice, numberOfTosses);
        System.out.println("***\n");
        for (Integer binNo = bins.getMin(); binNo <= bins.getMax(); binNo++)
            System.out.printf("%2d :%9d: %.2f %s\n",
                    binNo, bins.getBin(binNo), (double)bins.getBin(binNo) / (double)numberOfTosses,
                    stars(bins.getBin(binNo)/(numberOfTosses/100)));

    }

    private String stars(Integer numberOfStars) {
        String stars = "";
        for (Integer i = 0; i < numberOfStars; i++)
            stars+="*";

        return stars;
    }
}
