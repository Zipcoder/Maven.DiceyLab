import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dice {
    private static Logger logger = Logger.getLogger("Dice");
    private static int numberOfDice;

    public Dice(int numberOfDice) {
        Dice.numberOfDice = numberOfDice;
    }

    public int tossAndSum() {
        Random rand = new Random();
        Integer result = 0;
        Integer currentRoll;
        for (int i = 1; i <=  numberOfDice; i++) {
            result += rand.nextInt(6)+1;
        }
        logger.log(Level.INFO,"Result of rolling " + numberOfDice+ " dice = " + result);
        return result;
    }

}
