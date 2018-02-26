public class Simulation {
    private Dice dice;
    private Integer numOfTosses;
    private Integer startBound;
    private Integer endBound;
    private Bins bins;

    //constructor
    public Simulation(Integer numOfTosses, Integer numOfOfDies){
        Dice dice = new Dice(numOfOfDies);

        startBound = numOfOfDies;
        endBound = numOfOfDies * 6;

        this.numOfTosses = numOfTosses;

        bins = new Bins(startBound, endBound);
    }

    public void runSimulation(){
        for (int i = 0; i < numOfTosses; i++){
            bins.addToBin(dice.sumOfToss());
        }
    }

    public static String stars(Integer percentages){
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < percentages; i++){
             sb.append("*");
        }
        return sb.toString();

        }

    public String printResults(){
        StringBuilder sb = new StringBuilder();
        sb.append("***\nSimulation of " + startBound +" dice tossed for " + numOfTosses + " times.\n***\n\n");
        for (int i = startBound; i <= endBound; i++) {
            int diceSum = i;
            int numOfOccurrence = bins.getBin(diceSum);
            sb.append(String.format(" %2d :   %7d: %.2f ", diceSum, numOfOccurrence, (numOfOccurrence/(float)numOfTosses)));
            sb.append(stars((int)((numOfOccurrence/(float)numOfTosses)*100))+ "\n");
            }

        System.out.println(sb.toString());
        return sb.toString();
        }


    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000);
        simulation.runSimulation();
        simulation.printResults();
    }
}
