import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinsTest {
    @Test
    public void testBinConstructor () {
        int testMin = 2;
        int testMax = 12;
        int expected = testMax - testMin;

        Bins test = new Bins(testMin, testMax);
        int actualLength = test.values.length;

        Assert.assertEquals(expected, actualLength);
    }

    @Test
    public void testBinConstructor1 () {
        int testMin = 2;
        int testMax = 12;
        int expected = testMax - testMin;

        Bins test = new Bins(testMin, testMax);
        int actualLength = test.values.length;
        int actualValue = test.values[1];

        Assert.assertEquals(expected, actualLength);
        Assert.assertEquals(0, actualValue);
    }
}
