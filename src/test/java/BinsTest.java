import org.junit.Assert;
import org.junit.Test;


public class BinsTest {
    @Test
    public void getBin() {
        //given
        Bins bins = new Bins(2, 12);
        //When
        int actual =  bins.getBin(4);

        //Then
        Assert.assertEquals(0, actual);
    }
    @Test
    public void incrementTest(){
        Bins bin = new Bins(2,12);
        Integer expected = 2;
        bin.incrementBin(10);
        bin.incrementBin(10);

        Assert.assertEquals(expected, bin.getBin(10));
    }
}
