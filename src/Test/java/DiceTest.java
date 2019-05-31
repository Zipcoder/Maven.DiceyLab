import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testToss2(){
        Integer expectedMin=2;
        Integer expectedMax=12;
        Dice dice = new Dice(expectedMin);
        Integer actual = dice.toss();

        Assert.assertTrue(actual>=expectedMin);
        Assert.assertTrue(actual<=expectedMax);
    }

    @Test
    public void testToss5(){
        Integer expectedMin=5;
        Integer expectedMax=30;
        Dice dice = new Dice(expectedMin);
        Integer actual = dice.toss();

        Assert.assertTrue(actual>=expectedMin);
        Assert.assertTrue(actual<=expectedMax);
    }

}