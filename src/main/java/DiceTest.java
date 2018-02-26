

import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;
import org.junit.Assert;




public class DiceTest {

    @Test
    public void testConstructorWithNumberOfDice(){
        //Given
        Integer expected = 11;
        //When
        Dice dice = new Dice(11);
        Integer actual = dice.numberOfDice;
        //Actual

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSumOfToss1(){
        //Given
        Dice dice = new Dice(2);

        Integer actualToss = dice.sumOfToss();

        Assert.
//                (actualToss >= dice.numberOfDice && actualToss <= dice.numberOfDice * 6);
    }

}