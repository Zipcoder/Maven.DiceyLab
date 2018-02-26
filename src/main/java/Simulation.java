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

    public void runSimulation (int numberOfRolls) {

        for (int i = 0; i < numberOfRolls; i++)
            bins.incrementBin(dice.rollDice(2));

        }

    }

