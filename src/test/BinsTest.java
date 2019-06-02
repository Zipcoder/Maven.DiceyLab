import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class BinsTest {

    @Before
    public void setUp() throws Exception {
        Bins bins = new Bins(2, 12);
        Integer expected1 = 0;
        Integer actual1 = bins.getBins(3);
        Assert.assertEquals(expected1, actual1);

    }

    @Test
    public void getBins() {

    }

    @Test
    public void incrementBin() {
    }
}