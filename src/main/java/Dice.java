import java.util.Random;

public class Dice {

    private int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }
    public int tossAndSum() {
        int total = 0;
        for (int i = 0; i <numberOfDice; i++) {
            total += randomRoll();
        }

        return total;
    }
    public int randomRoll() {
        int total = 0;
        Random random = new Random();
        total += random.nextInt((6-1)+1)+1;
        return total;
    }
}
