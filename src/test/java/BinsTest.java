import org.junit.Assert;
import org.junit.Test;


public class BinsTest {

    @Test
    public void binsConstructorTest(){
        Bins bins = new Bins(2,12);
        Integer actualFirst = 2;
        Integer actualLast = 12;
        Integer expectedFirst = bins.getFirst();
        Integer expectedLast = bins.getLast();
        Integer expected = 0;

        Assert.assertEquals(actualFirst, expectedFirst);
        Assert.assertEquals(actualLast, expectedLast);
        Assert.assertEquals(expected, bins.getBin(2));
    }

    @Test
    public void getBinTest(){
        Bins bin1 = new Bins(2,12);
        Integer expected = 0;

        Assert.assertEquals(expected, bin1.getBin(12));
    }

    @Test
    public void incrementTest(){
        Bins bin2 = new Bins(2,12);
        Integer expected = 1;
        bin2.incrementBin(10);

        Assert.assertEquals(expected, bin2.getBin(10));
    }
}
