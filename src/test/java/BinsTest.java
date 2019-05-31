import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void testBinsConstructor() {
        Bins bins = new Bins(2, 12);
        int length = bins.getSums().length;
        Assert.assertEquals(13, length);
    }
    @Test
    public void incrementBinTest() {
        Bins bins = new Bins(2, 12);
        Integer[] results = bins.getSums();
        bins.incrementBin(2);
        Integer expected = 1;
        Integer actual = results[2];
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBin() {
    }
}