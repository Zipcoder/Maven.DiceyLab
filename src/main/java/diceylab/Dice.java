package diceylab;

public class Dice {
    private static int numberOfDice;

    // Constructor
    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Integer rollDice() {
        int rollValue = 0;
        for (int i = 0; i < numberOfDice; i++) {
            rollValue += (int) (Math.random() * 6) + 1;
        }
        return rollValue;
    }

}
