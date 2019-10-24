package diceylab;

import org.junit.Test;
import org.junit.Assert;

public class DiceTest {
    @Test
    public void rollDiceTest() {
        Dice dice = new Dice(1);
        int result = dice.rollDice();
        Assert.assertFalse(result == 0);

    }
}