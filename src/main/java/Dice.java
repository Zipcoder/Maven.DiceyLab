import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dice {
    private static Logger logger = Logger.getLogger("Dice");
    private static int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public static Integer tossAndSum() {
        Random rand = new Random();
        Integer result = 0;
        Integer currentRoll;
        for (int i = 1; i <=  numberOfDice; i++) {
            result += rand.nextInt(6)+1;
        }
        logger.log(Level.INFO,"Current Number is " + result);
        return result;
    }

}
