public class Simulation {
    private Integer numberOfThrows;
    private Dice dice;
    private Bins bins;
    private int startingBound;
    private int endingBound;

    //Constructor
    public Simulation(Integer numberOfDie, Integer numberOfThrows) {
        dice = new Dice(numberOfDie);

        startingBound = numberOfDie;
        endingBound = numberOfDie * 6;

        bins = new Bins(startingBound, endingBound);
        this.numberOfThrows = numberOfThrows;
    }


    //Methods
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


//public class Simulation {
//Bins bins = new Bins();
//Dice dicetoRoll;
//Bin binStorage;
//public Simulation (Dice dicetoRoll, Bins binStorage){
//    this.dicetoRoll = dicetoRoll;
//    this.binStorage = binStorage;
//}
//
//    public static void main(String[] args) {
//        System.out.println(rollDiceSim());
//        System.out.println(rollDiceSim(2));
//        return bins.incrementBin(dice.rollDiceSim(2));