package com.github.zipcodewilmington.bintest;

import com.github.zipcodewilmington.Bin;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorTest {

    @Test
    public void test1() {
        //given
        Integer expectedValueToBeTracked = null;
        Integer expectedNumberOfOccurences = 0;

        //when
        Bin bin = new Bin(expectedValueToBeTracked);
        Integer actualValueToBeTracked = bin.getValueToBeTracked();
        Integer actualNumberOfOccurences = bin.getNumberOfOccurences();

        //then
        Assert.assertEquals(expectedValueToBeTracked, actualValueToBeTracked); //actual should be equal to bin.getValueToCheck
        Assert.assertEquals(expectedNumberOfOccurences, actualNumberOfOccurences);

    }

    @Test
    public void test2() {
        //given
        Integer expectedValueToBeTracked = 4;
        Integer expectedNumberOfOccurences = 0;

        //when
        Bin bin = new Bin(expectedValueToBeTracked);
        Integer actualValueToBeTracked = bin.getValueToBeTracked();
        Integer actualNumberOfOccurences = bin.getNumberOfOccurences();

        //then
        Assert.assertEquals(expectedValueToBeTracked, actualValueToBeTracked);
        Assert.assertEquals(expectedNumberOfOccurences, actualNumberOfOccurences);
    }

    @Test
    public void test3() {
        //given
        Integer expectedValueToBeTracked = 2;
        Integer expectedNumberOfOccurences = 0;

        //when
        Bin bin = new Bin(expectedValueToBeTracked);
        Integer actualValueToBeTracked = bin.getValueToBeTracked();
        Integer actualNumberOfOccurences = bin.getNumberOfOccurences();

        //then
        Assert.assertEquals(expectedValueToBeTracked, actualValueToBeTracked);
        Assert.assertEquals(expectedNumberOfOccurences, actualNumberOfOccurences);
    }
    //________________________example for writing tests easierVVV

    private void test(Integer expectedValueToBeTracked) {
        //given
        Integer expectedNumberOfOccurences = 0;

        //when
        Bin bin = new Bin(expectedValueToBeTracked);
        Integer actualValueToBeTracked = bin.getValueToBeTracked();
        Integer actualNumberOfOccurences = bin.getNumberOfOccurences();

        //then
        Assert.assertEquals(expectedValueToBeTracked, actualValueToBeTracked);
        Assert.assertEquals(expectedNumberOfOccurences, actualNumberOfOccurences);
    }

    //you could call to this method ^^^ at the end of your test and your line for each test would be
    // VVV
    @Test
    public void test4() {
        test(99);
    }
}
