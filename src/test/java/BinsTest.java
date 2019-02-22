import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void binsTest() {
        Bins results = new Bins(2,12);

        int expected = -1;
        int actual = -2;

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void numOfTensTest(){
        Bins results = new Bins(2,12);
        Integer numberOfTens = results.getBin(10);
    }

//    @Test
//    public void incrementBinsTest(){
//        Bins results;
//        results.incrementBin(10);
//    }


}
