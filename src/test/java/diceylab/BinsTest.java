package diceylab;

import org.junit.Test;
import org.junit.Assert;

public class BinsTest {
    @Test
    public void incrementBinTest() {
        Bins bins = new Bins(2, 12);
        bins.initBins(12);
        int actual = bins.incrementBin(2);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}