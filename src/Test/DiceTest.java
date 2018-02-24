import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void testConstructorWithNumOfDice() {
        Dice dice = new Dice(10);

        Integer expected = 10;
        Integer actual = dice.numOfDice;

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testTossAndSum1 () {
        Dice dice = new Dice(1);

        Integer actualToss = dice.tossAndSum();

        Assert.assertTrue(actualToss >= dice.numOfDice && actualToss <= dice.numOfDice * 6);
    }

    @Test
    public void testTossAndSum2 () {
        Dice dice = new Dice(2);

        Integer actualToss = dice.tossAndSum();

        Assert.assertTrue(actualToss >= dice.numOfDice && actualToss <= dice.numOfDice * 6);
    }

    @Test
    public void testTossAndSum3 () {
        Dice dice = new Dice(3);

        Integer actualToss = dice.tossAndSum();

        Assert.assertTrue(actualToss >= dice.numOfDice && actualToss <= dice.numOfDice * 6);
    }


}