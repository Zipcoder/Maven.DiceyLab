import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private Integer tossAmt = 0;

    public Dice(Integer randomTosses) {
        this.tossAmt = randomTosses;
    }

    public Integer tossAndSum() {
        int sum = 0;
        for (int i = 0; i < this.tossAmt; i++) {
            sum += ThreadLocalRandom.current().nextInt(1, 7);
        }

        return sum;
    }

}
