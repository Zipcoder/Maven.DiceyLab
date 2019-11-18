package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class BinsTest {


    @Test
    public void binTest1() {
        Bins bins = new Bins(13);
        int actual = bins.getBins(6);
        int expected = 0;
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void binTest2(){
        Bins bins = new Bins(13);
        bins.incrementBin(6);
        int actual = bins.getBins(6);
        int expected = 1;
        Assert.assertEquals(expected,actual);
    }
}
