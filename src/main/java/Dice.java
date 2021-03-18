import java.util.Random;

public class Dice {

    private Integer numberOfDice;
    private Integer rollResult;
    private Random random = new Random(3);
    private int seed;

    public Dice (Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
        this.rollResult = rollResult;
    }
    public Dice(Integer numberOfDice, int seed) {
        this.numberOfDice = numberOfDice;
        this.seed = seed;
    }

    public Integer tossAndSum() {
        Integer rollSum = 0;
        for(int i = 0; i < numberOfDice; i++) {
            rollResult = random.nextInt(6) + 1;
            rollSum += rollResult;
        }
        return rollSum;
    }
    public Integer tossAndSumWithSeed() {
        Integer rollSum = 0;
        for(int i = 0; i < numberOfDice; i++) {
            rollResult = random.nextInt(6) + 1;
            rollSum += rollResult;
        }
        return rollSum;
    }



}
