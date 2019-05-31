import org.junit.Assert;
import org.junit.Test;


public class BinsTest {


    @Test
    public void getBinTest() {
        Bins bins = new Bins(1,6);
        Assert.assertEquals(0,(int)bins.getBin(1));
    }

    @Test
    public void getBinTestTail() {
        Bins bins = new Bins(1,6);
        Assert.assertEquals(0,(int)bins.getBin(6));
    }

    @Test
    public void getBinTestNoBin() {
        Bins bins = new Bins(1,6);
        Assert.assertNull(bins.getBin(0));
    }

    @Test
    public void incrementBinTest() {
        Bins bins = new Bins(1,6);
        bins.incrementBin(2);
        Assert.assertEquals(1, (int)bins.getBin(2));
    }
}