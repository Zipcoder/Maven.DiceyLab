import java.util.Random;

public class Dice {

    private int numberOfDice;

    public Dice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum() {
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum += (int)(Math.random() * 6 + 1);
        }
        return sum;

    }

    public Integer getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }
}
