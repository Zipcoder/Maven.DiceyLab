import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private Integer tossAmt = 0;
    private Random rng;

    public Dice(Integer randomTosses) {
        this.tossAmt = randomTosses;
        this.rng = new Random();
    }

    public Dice(Integer randomTosses, Long seed) {
        this.rng = new Random(seed);
        this.tossAmt = randomTosses;
    }

    public Integer tossAndSum() {
        int sum = 0;
        for (int i = 0; i < this.tossAmt; i++) {
            sum += rng.nextInt(6) + 1;
        }

        return sum;
    }

}
