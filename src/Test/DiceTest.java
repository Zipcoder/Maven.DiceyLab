import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void testNumberOfDies()
    {
        Dice dice = new Dice(5);

        Integer expected = 5;
        Integer actual = dice.numberofDies;

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testSumOfToss()
    {
        Dice dice = new Dice(3);

        Integer actual = dice.tossAndSum();

        Assert.assertTrue(actual >= dice.numberofDies && actual <= dice.numberofDies *6);
    }




}