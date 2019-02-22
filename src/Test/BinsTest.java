import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void testConstructorWithStartingAndEndingBin() {
        Bins bins = new Bins(3, 100);

        Integer expected1 = 0;
        Integer actual1 = bins.getBin(3);

        Assert.assertEquals(expected1, actual1);
    }

    @Test
    public void testGetBin(){
        Bins bins = new Bins(3, 10);

        int expected = 0;
        int actual = bins.getBin(3);

        Assert.assertEquals(expected,actual);
    }


}