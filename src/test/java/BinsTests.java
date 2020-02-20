import org.junit.Assert;
import org.junit.Test;

public class BinsTests {

    @Test
    public void constructorTest(){
        int least = 5;
        int most = least * 6;
        Bins binConstructTest = new Bins(least,most);

        int expectedBinSumPos0 = 0;
        int actualBinSumPos0 = binConstructTest.sums.get(0);
        Assert.assertEquals(expectedBinSumPos0, actualBinSumPos0);
    }

    @Test
    public void getBinTest(){

        Simulation getBinTest = new Simulation(2,1000000);

        int expectedMost =  getBinTest.bin.mostOccuring();
        int actualMost = getBinTest.bin.getBin(7);

        int expectedLeast =  getBinTest.bin.leastOccuring();
        int actualLeast = getBinTest.bin.getBin(12);

        Assert.assertEquals(expectedMost, actualMost);
        Assert.assertEquals(expectedLeast, actualLeast);

    }

}
