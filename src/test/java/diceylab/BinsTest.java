package diceylab;

import org.junit.Test;
import org.junit.Assert;

public class BinsTest {
    @Test
    public void getBinTest1() {
        Bins bins = new Bins(2);
        int actual = bins.getBin(2);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBinTest2() {
        Bins bins = new Bins(5);
        bins.incrementBin(20);
        bins.incrementBin(20);
        int actual = bins.getBin(20);
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBinTest3() {
        Bins bins = new Bins(2);
        for (int i = 0; i < 30; i++) {
            bins.incrementBin(10);
        }
        int actual = bins.getBin(10);
        int expected = 30;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinTest1() {
        Bins bins = new Bins(2);
        int actual = bins.incrementBin(2);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinTest2() {
        Bins bins = new Bins(2);

        bins.incrementBin(2);
        bins.incrementBin(2);
        bins.incrementBin(2);
        int actual = bins.incrementBin(2);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void incrementBinTest3() {
        Bins bins = new Bins(5);
        bins.incrementBin(20);
        bins.incrementBin(20);
        int actual = bins.incrementBin(20);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBinsArrayTest() {
        Bins bins = new Bins(2);
        Integer[] actual = bins.getBinsArray();
        Integer[] expected = {null, null, 0,0,0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < actual.length; i++) {
            Assert.assertEquals(expected[i],actual[i]);
        }
    }
}