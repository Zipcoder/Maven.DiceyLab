import java.util.Random;

public class Simulation {
    private Integer numberOfTosses;
    private int startBound;
    private int endBound;
    private Dice dice; //Using the Dice class
    private Bins bins; //Using the Bins class

    public Simulation(int numberOfDies, int numberOfTosses)
    {
        dice = new Dice(numberOfDies);

        startBound = numberOfDies;
        endBound = numberOfDies * 6;

        this.numberOfTosses = numberOfTosses;

        bins = new Bins(startBound, endBound);

    }

    public void runSimulation()
    {
        for (int i = 0; i < numberOfTosses; i++)
        {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public static String asterisks(Integer percentages)
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < percentages; i++)
        {
            sb.append("*");
        }

        return sb.toString();

    }

    public String printResults()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("***\nSimulation of " + startBound + " dice tossed for " + numberOfTosses + " times.\n***\n\n");

        for (int i = startBound; i <= endBound; i++)
        {
            int diceSum = i;
            int numberOfOccurence = bins.getBin(diceSum);
            int percent = (int)(numberOfOccurence/(float)numberOfTosses * 100);

            sb.append(String.format("%2d : %7d: %.2f", diceSum, numberOfOccurence, (numberOfOccurence/(float)numberOfTosses)));
            sb.append(asterisks(percent) + "\n");
        }

        System.out.println(sb.toString());
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Simulation simulation = new Simulation(2, 1000000);
        simulation.runSimulation();
        simulation.printResults();

    }





}
