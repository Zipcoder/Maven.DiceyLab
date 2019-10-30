import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

//    @Test
//    public void binExists() {
//        Bins bins = new Bins();
//        Integer[] expected = new Integer[13];
//        Integer[] actual = bins.createBins();
//        Assert.assertEquals(expected, actual);
//    }
//}

    @Test
    public void getBinTest ()
    {
        Bins testBin = new Bins(2);
        Integer expected = 0;
        Integer actual = testBin.getBin(5);
        Assert.assertEquals(expected,actual);
    }



    @Test
    public void getBinTest2 ()
    {
        Bins testBin = new Bins(2);
        Integer expected = null;
        Integer actual = testBin.getBin(1);
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void incrementBinTest ()
    {
       Bins testBin = new Bins(2);
        Integer expected = 1;
        testBin.incrementBin(6);
        Integer actual = testBin.getBin(6);
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void incrementBinTest2 ()
    {
        Bins testBin = new Bins(2);
        Integer expected = 1;
        testBin.incrementBin(8);
        Integer actual = testBin.getBin(8);
        Assert.assertEquals(expected, actual);

    }
}

