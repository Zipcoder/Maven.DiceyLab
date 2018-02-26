public class Simulation extends Dice {

    private int numberOfRolls;
    private int numberOfDice;
    private Dice dice;
    private Bins bins;
    private int minIndex;
    private int maxIndex;


    public Simulation() {

    }

    public Simulation (int numberOfDice, int minIndex) {
        dice = new Dice();

        minIndex = numberOfDice;
        maxIndex = numberOfDice * 6;

        bins = new Bins(minIndex, maxIndex);

        this.numberOfRolls = numberOfRolls;
          }

    public void runSimulation (int numberOfRolls, int rollsOfDie) {

        for (int i = 0; i < numberOfRolls; i++)
            bins.incrementBin(dice.rollDice(rollsOfDie));

        }

     public String printIt(int minIndex, int maxIndex, int numberOfRolls) {
         StringBuilder sb = new StringBuilder();
             sb.append("***\nSimulation of " + minIndex +" dice tossed for " + numberOfRolls + " times.\n***\n\n");
        for (int y = minIndex; y <= maxIndex; y++){
            int diceSum = y;
            int numOfOccurrence = bins.getBins(diceSum);
            sb.append(String.format(" %2d :   %7d: %.2f", diceSum, numOfOccurrence, (numOfOccurrence/(float)numberOfRolls)));
            sb.append(numberOfStars((int) ((numOfOccurrence/(float)numberOfRolls)*100))+ "\n");
         }

         System.out.println(sb.toString());
            return sb.toString();

     }

     public String numberOfStars(int percentOutcome){
        StringBuilder sb1 = new StringBuilder();
        for (int otc = 0; otc < percentOutcome; otc++) {
            sb1.append("*");
        }
        return sb1.toString();
     }



    public static void main(String[] args) {
        Simulation simulation = new Simulation(2,2);
        simulation.runSimulation(1000000,2);
        simulation.printIt(2,12,1000000);






    }

    }

