
import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void randomRollTest() {
        Dice dice = new Dice(2);
        int actual = dice.randomRoll();
        Assert.assertTrue(actual> 0 && actual < 7);
    }

    @Test
    public void tossAndSum() {
        Dice dice = new Dice(2);
        int actual = dice.tossAndSum();
        Assert.assertTrue(actual > 1 && actual < 13);
    }

        }