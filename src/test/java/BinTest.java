import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BinTest {

    @Test
    public void testBinConstructor(){
        //given
        int testMin = 2;
        int testMax = 12;
        int expected = (testMax - testMin) + 1;

        //when
        Bins test = new Bins(testMin, testMax);
        int actualLength = test.sumOfRolls.length;
        int actualValue = test.sumOfRolls[1];

        //then
        Assert.assertEquals(expected, actualLength);
        Assert.assertEquals(0, actualValue);

    }

    @Test
    public void testBinIncrement(){
        //given
        Bins test = new Bins(2, 12);
        int testSum = 7;

        //when

        test.incrementBin(testSum);

        //then
        int actual = test.getBin(testSum);
        String testString = Arrays.toString(test.sumOfRolls);
        //Do not use String.valueOf for Integer ARRAYS!
        System.out.println(testString);
        Assert.assertEquals(1, actual);

    }

    @Test
    public void testBinIncrement2() {
        //given
        Bins test = new Bins(2, 12);
        int testSum = 7;

        //when

        test.incrementBin(testSum);
        test.incrementBin(testSum);

        //then
        int actual = test.getBin(testSum);
        String testString = Arrays.toString(test.sumOfRolls);
        //Do not use String.valueOf for Integer ARRAYS!
        System.out.println(testString);
        Assert.assertEquals(2, actual);
    }
}
