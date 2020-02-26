import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BinsTest {

    private static final Logger LOGGER = Logger.getLogger(BinsTest.class.getName());

    @Test
    public void binsTest() {
    // Given
    Bins testBin = new Bins(2,12);

    //When
    testBin.incrementBin(10);
    Integer expected = 1;
    Integer actual = testBin.getBin(10);
    //LOGGER.log(Level.INFO, actual + "");
    //Then
    Assert.assertEquals(expected, actual);
}

    @Test
    public void binsTest2() {
    // Given
    Bins testBin = new Bins(3,18);

    //When
    testBin.incrementBin(14);
    Integer expected = 1;
    Integer actual = testBin.getBin(14);
    //LOGGER.log(Level.INFO, actual +"");

    //Then
    Assert.assertEquals(expected, actual);
}

    @Test
    public void binsTest3() {
        // Given
        Bins testBin = new Bins(1,6);

        //When
        testBin.incrementBin(3);
        Integer expected = 1;
        Integer actual = testBin.getBin(3);
        //LOGGER.log(Level.INFO, actual +"");

        //Then
        Assert.assertEquals(expected, actual);
    }

}



