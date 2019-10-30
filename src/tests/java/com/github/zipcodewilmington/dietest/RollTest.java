package com.github.zipcodewilmington.dietest;

import com.github.zipcodewilmington.Die;
import org.junit.Assert;
import org.junit.Test;

public class RollTest {

    @Test(expected = NullPointerException.class)
    public void test1() {
        //given
        Integer numberOfFaces = null;

        Die die = new Die(numberOfFaces);

        //when
        die.roll();
    }

    @Test (expected = IllegalArgumentException.class)
    //exception thrown when test is ran at 1 face.
    //a die cannot have one face because it will always be itself.
    //show that an exception will be expected
    public void test2() {
        //given
        Integer unexpected = null;
        Integer numberOfFaces = 1;
        Die die = new Die(numberOfFaces);

        //when
        die.roll();
    }

    @Test
    public void test3() {
        //given
        Integer unexpected = null;
        Integer numberOfFaces = 3;
        Die die = new Die(numberOfFaces);

        //when
        die.roll();
        Integer actual = die.getCurrentFaceValue();

        //then
        Assert.assertNotEquals(unexpected, actual);
    }

    @Test
    public void test4() {
        //given
        Integer unexpected = null;
        Integer numberOfFaces = 5;
        Die die = new Die(numberOfFaces);

        //when
        die.roll();
        Integer actual = die.getCurrentFaceValue();

        //then
        Assert.assertNotEquals(unexpected, actual);
    }

    @Test
    public void test5() {
        //given
        Integer unexpected = null;
        Integer numberOfFaces = 8;
        Die die = new Die(numberOfFaces);

        //when
        die.roll();
        Integer actual = die.getCurrentFaceValue();

        //then
        Assert.assertNotEquals(unexpected, actual);
    }
}
