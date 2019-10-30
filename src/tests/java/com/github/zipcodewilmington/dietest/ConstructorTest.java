package com.github.zipcodewilmington.dietest;

import com.github.zipcodewilmington.Die;
import org.junit.Assert;
import org.junit.Test;

public class ConstructorTest {
    @Test
    public void test1() {
        //given
        Integer expectedFaceValue = null;
        Integer expectedNumberOfFaces = null;

        //when
        Die die = new Die(expectedNumberOfFaces);
        Integer actualFaceValue = die.getCurrentFaceValue();
        Integer actualNumberOfFaces = die.getCurrentFaceValue();

        //then
        Assert.assertEquals(expectedFaceValue, actualFaceValue);
        Assert.assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
    }
    @Test
    public void test2() {
        //given
        Integer expectedFaceValue = null;
        Integer expectedNumberOfFaces = 9;

        //when
        Die die = new Die(expectedNumberOfFaces); //whenever a default die is made, it should have 6 sides but a non-default die can be made anytime
        Integer actualFaceValue = die.getCurrentFaceValue();
        Integer actualNumberOfFaces = die.getNumberOfFaces();

        //then
        Assert.assertEquals(expectedFaceValue, actualFaceValue);
        Assert.assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
    }
    @Test
    public void test3() {
        //given
        Integer expectedFaceValue = null;
        Integer expectedNumberOfFaces = 5;

        //when
        Die die = new Die(expectedNumberOfFaces); //whenever a default die is made, it should have 6 sides but a non-default die can be made anytime
        Integer actualFaceValue = die.getCurrentFaceValue();
        Integer actualNumberOfFaces = die.getNumberOfFaces();

        //then
        Assert.assertEquals(expectedFaceValue, actualFaceValue);
        Assert.assertEquals(expectedNumberOfFaces, actualNumberOfFaces);
    }

}
