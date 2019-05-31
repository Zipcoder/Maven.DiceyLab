import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void getBin() {
        Integer testBin=7;
        Integer expected =42;
        Bins bins = new Bins(2,12);
        bins.someBins[testBin]=expected;
        Integer actual = bins.getBin(testBin);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void incrementBin() {
        Integer testBin=7;
        Integer initial=42;
        Integer expected =initial+1;
        Bins bins = new Bins(2,12);
        bins.someBins[testBin]=initial;
        bins.incrementBin(testBin);
        Integer actual = bins.getBin(testBin);
        Assert.assertEquals(expected,actual);
    }
}