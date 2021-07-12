import junit.framework.TestCase;
import org.junit.Assert;

public class DiceTest extends TestCase {

    public void testTossAndSum() {
        Dice dice = new Dice(1);
        int result = dice.tossAndSum();
        //Assert.assertEquals(2,result);
        Assert.assertTrue(result>0 && result <7);
    }

    public void testGetNumberOnDice() {
        Dice dice = new Dice(2);
        Integer expected = dice.getNumberOnDice();
        Integer actual = 2;
        Assert.assertEquals(expected, actual);
    }
}