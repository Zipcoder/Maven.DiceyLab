import org.junit.Assert;
import org.junit.Test;

public class BinTest {

    @Test
    public void incrementBinTest() {
        Bins bin = new Bins();
        bin.getBinMap().put(2, 1);
        bin.incrementBin(2);
        int actual = bin.getBin(2);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }
}
