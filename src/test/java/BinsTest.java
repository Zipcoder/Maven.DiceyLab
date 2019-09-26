
import org.junit.Assert;
import org.junit.Test;


public class BinsTest {
    public void setUp(){

    }
    @Test
    public void testGetBinDefaultValue(){
        Bins bins = new Bins(2, 12);
        int expected = 0;
        int actual = bins.getBin(2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testIncrementBin(){
        Bins bins = new Bins(2,12);
        bins.incrementBin(2);
        int expected = 1;
        int actual = bins.getBin(2);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testIncrementBinTwice(){
        int binKey = 2;
        Bins bins = new Bins(2,12);
        bins.incrementBin(binKey);
        bins.incrementBin(binKey);
        int expected = 2;
        int actual = bins.getBin(binKey);
        Assert.assertEquals(expected, actual);
    }

}
