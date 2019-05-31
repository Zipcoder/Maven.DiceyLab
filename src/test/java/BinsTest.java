import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void constructorDiceMinTest(){
        Dice dice = new Dice(2);
        Bins bins = new Bins(dice);
        Integer expected = 2;

        Integer actual = bins.getMinValue();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorDiceMaxTest(){
        Dice dice = new Dice(2);
        Bins bins = new Bins(dice);
        Integer expected = 12;

        Integer actual = bins.getMaxValue();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorDiceArrayTest(){
        Dice dice = new Dice(2);
        Bins bins = new Bins(dice);
        Integer[] expected = {0,0,0,0,0,0,0,0,0,0,0};

        Integer[] actual = bins.getAllBins();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorRangeMinTest(){
        Integer min = 2;
        Integer max = 12;
        Bins bins = new Bins(min,max);

        Integer actual = bins.getMinValue();

        Assert.assertEquals(min,actual);
    }

    @Test
    public void constructorRangeMaxTest(){
        Integer min = 2;
        Integer max = 12;
        Bins bins = new Bins(min,max);

        Integer actual = bins.getMaxValue();

        Assert.assertEquals(max,actual);
    }

    @Test
    public void constructorRangeArrayTest(){
        Integer min = 2;
        Integer max = 12;
        Bins bins = new Bins(min,max);
        Integer[] expected = {0,0,0,0,0,0,0,0,0,0,0};

        Integer[] actual = bins.getAllBins();

        Assert.assertEquals(expected, actual);
    }

    /*
    Needed to verify the getBinValue method before testing the incrementer
    to test the getBinValue without the incrementer, the bins array had to
    be manually changed to incorrect values. The tests are preserved but
    commented out because they SHOULD fail if Bins is written correctly.

    @Test
    public void getBinValueTest1(){
        // requires incorrect code in Bins constructor
        Dice dice = new Dice(2);
        Bins bins = new Bins(dice);
        Integer expected = 1;

        Integer actual = bins.getBinValue(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getBinValueTest2(){
        // requires incorrect code in Bins constructor
        Dice dice = new Dice(3);
        Bins bins = new Bins(dice);;
        Integer expected = 5;

        Integer actual = bins.getBinValue(10);

        Assert.assertEquals(expected, actual);
    }

     */

    @Test
    public void incrementBinTest1(){
        Dice dice = new Dice(2);
        Bins bins = new Bins(dice);
        Integer expected = 1;

        bins.incrementBin(6);
        Integer actual = bins.getBinValue(6);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void incrementBinTest2(){
        Dice dice = new Dice(5);
        Bins bins = new Bins(dice);
        Integer expected = 2;

        bins.incrementBin(30);
        bins.incrementBin(30);

        Integer actual = bins.getBinValue(30);

        Assert.assertEquals(expected, actual);
    }

}