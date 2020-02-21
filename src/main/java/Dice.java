
import java.util.Random;

public class Dice {

    private int number;

    public Dice(int number) {
        this.number = number;
    }

    public Integer tossAndSum() {
        int sum = 0;
        int alea;
        for (int i = 0; i < number; i++) {
            alea = getRandomNumberInRange();
            sum +=  alea;
        }
        return sum;
    }

    private static int getRandomNumberInRange() {

        Random r = new Random();
        return r.nextInt((6 - 1) + 1) + 1;
    }


}
