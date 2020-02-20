import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void checkBins(){
        Bins bins = new Bins(2,12);
        Dice dice = new Dice(2);
        int val = Dice.tossAndSum();

        bins.incrementBin(val);
        int expected = 1;
        int actual = bins.getBin(val);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void CheckBins2(){
        Bins bins = new Bins(25,12);
        Dice dice = new Dice(25);
        int val = Dice.tossAndSum();

        bins.incrementBin(val);
        int expected = 1;
        int actual = bins.getBin(val);

        Assert.assertEquals(expected,actual);
    }


}
