import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void testConstructorStartRollandEndingRoll(){
        //Given
        Bins bins = new Bins(2, 12);
        //When
        Integer expected = 0;
        Integer actual = bins.getBin(2);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGetBin(){
        //Given
        Bins bins = new Bins(2, 9);
        //When
        Integer expected = 0;
        Integer actual = bins.getBin(2);
        //Actual
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddToBin(){
        //Given
        Bins bins = new Bins(2, 10);
    }

}