import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void tallyTest() {

        Bins myBins = new Bins(13);

        myBins.tally(5);
        myBins.tally(5);

        Integer expected = 2;
        Integer actual = myBins.getTally(5);

        Assert.assertEquals(expected, actual);
    }
}