import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void incrementBinTest ()
    {
        Bins testBin = new Bins();
        Integer expected = 1;
        testBin.incrementBin(12);
        Assert.assertSame(expected, testBin[10]);

    }
}
