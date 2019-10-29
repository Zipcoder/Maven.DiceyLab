import org.junit.Assert;
import org.junit.Test;

import javax.print.attribute.standard.PrintQuality;

public class DiceTest {

//    @Test
//    public void diceConstructorTest ()
//    {
//        Integer expected = 2;
//        Dice testDie = new Dice(expected);
//        Integer actual = testDie.getNumOfDiceBeingRolled();
//        Assert.assertEquals(expected, actual);
//    }

   @Test
    public void diceRollTest()
    {
        Dice dieTest = new Dice ();
        Integer expected = dieTest.rollDie1();
        Assert.assertTrue((expected >=1 && expected <=6));
    }

}


//    @Test
//    public void testConstructorWithAge() {
//        // Given
//        Integer expected = 5;
//
//        // When
//        Person person = new Person(expected);
//
//        // Then
//        Integer actual = person.getAge();
//        Assert.assertEquals(expected, actual);
//    }