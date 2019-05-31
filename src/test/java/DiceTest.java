import org.junit.Assert;
import org.junit.Test;


public class DiceTest {

    @Test
    public void tossTest(){
        Dice dice = new Dice(1);

        dice.toss();
        Integer dieResult = dice.getDice()[0];
        Assert.assertTrue(dieResult >= 1 && dieResult <= 6);
    }

    @Test
    public void sumTest(){
        Dice dice = new Dice(6);
        // since it's not tossed, every dice will be 1
        Assert.assertEquals(6, (int) dice.sum());
    }

    @Test
    public void tossAndSumTest(){
        Dice dice = new Dice(2);
        Integer sum = dice.tossAndSum();
        Assert.assertTrue(sum >= 2 && sum <= 12);
    }


}