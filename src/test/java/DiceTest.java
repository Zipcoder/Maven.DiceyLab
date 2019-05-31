import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void constructorTest() {
        Integer numberOfDice = 2;
        Dice dice = new Dice(numberOfDice);
        Integer[] rolls = dice.getRolls();
        Integer expectedRollsLength = 2;

    }

    @Test
    public void tossAndSumTest() {
        Integer numberOfDice = 1;
        Dice dice = new Dice(numberOfDice);
        Integer actual = dice.tossAndSum();
        Integer expected = dice.getRolls()[0];
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dieRollTest() {
        Integer numberOfDice = 2;
        Dice dice = new Dice(numberOfDice);
        Integer lowestNumber = 0;
        Integer highestNumber = 6;
        Integer roll = dice.dieRoll();
        Assert.assertFalse(roll < lowestNumber);
        Assert.assertFalse(roll > highestNumber);
    }
}