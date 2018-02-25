/* Create a Simulation class whose Constructor takes arguments: numberOfDies
to throw numberOfTosses to run

Create a simulation where two dies are thrown one million times.
Keep track of all results.

Simulation sim = new Simulation(2, 10000);

sim.runSimulation();

sim.printResults();
*/

public class Simulation {
    private Integer numberOfThrows;
    private Dice dice;
    private Bins bins;
    private int startingBound;
    private int endingBound;

    public Simulation(Integer numberOfDie, Integer numberOfThrows) {
        dice = new Dice(numberOfDie);

        startingBound = numberOfDie;
        endingBound = numberOfDie * 6;

        bins = new Bins(startingBound, endingBound);
        this.numberOfThrows = numberOfThrows;
    }



    public void runSimulation(){
        for(int i = 0; i < numberOfThrows; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public String numberOfStars (Integer percentageOfOutcome) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < percentageOfOutcome; i++){
               sb.append("*");
        }
        return sb.toString();
    }

    public String printResults(){
        StringBuilder sb = new StringBuilder();
        sb.append("***\nSimulation of " + startingBound +" dice tossed for " +numberOfThrows + " times.\n***\n\n");
        for (int i = startingBound; i <= endingBound; i++) {
            int diceSum = i;
            int numOfOccurrence = bins.getBin(diceSum);
            sb.append(String.format(" %2d :   %7d: %.2f ", diceSum, numOfOccurrence, (numOfOccurrence/(float)numberOfThrows)));
            sb.append(numberOfStars((int) ((numOfOccurrence/(float)numberOfThrows)*100))+ "\n");
        }

        System.out.println(sb.toString());
        return sb.toString();
    }
}
