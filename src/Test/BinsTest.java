import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

//    @Test
//    public void testConstructorWithStartingAndEndingBin() {
//        Bins bins = new Bins(3, 100);
//
//        Integer expected1 = 3;
//        Integer expected2 = 100;
//        Integer actual1 = bins.getStartingBin();
//        Integer actual2 = bins.getEndingBin();
//
//        Assert.assertEquals(expected1, actual1);
//        Assert.assertEquals(expected2, actual2);
//    }
//
//    @Test
//    public void testIncrementBin(){
//        Bins bins = new Bins(3, 100);
//
//        Integer expected = 13;
////        Integer actual = bins.incrementBin(10);
//
//        Assert.assertEquals(expected, actual);
//    }

    @Test
    public void testConstructorWithStartingAndEndingBound (){
        Bins bins = new Bins(3, 100);

        int expected = 3;
        int actual = bins.getBin(3);

        Assert.assertEquals(expected,actual);
    }


}