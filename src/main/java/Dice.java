import java.util.Random;

public class Dice {

    public int numberOfDice;

    public Dice(int numOfDice) {
        this.numberOfDice = numOfDice;
    }

    public Integer diceRoll() {

        int diceSum = 0;
        for(int i = 0; i < numberOfDice; i++) {
            diceSum += (int) Math.floor(Math.random() * 6) + 1;
        }
        return diceSum;
    }
    public int getNumberOfDice() {
        return numberOfDice;
    }
}