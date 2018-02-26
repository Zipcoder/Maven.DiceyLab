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

        this.numberOfTosses = numberOfDies;

    }

    public void runSimulation()
    {
        for (int i = 0; i < numberOfTosses; i++)
        {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public String asterisks(Integer percentages)
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

            sb.append(String.format(" 2d : %7d: %.2f", diceSum, numberOfOccurence, (numberOfOccurence/(float)numberOfTosses)));
            sb.append(asterisks((int) ((numberOfTosses/(float)numberOfTosses) + 100)) + "\n");
        }

        System.out.println(sb.toString());
        return sb.toString();
    }





}
