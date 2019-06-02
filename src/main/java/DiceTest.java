import org.junit.Assert;
import org.junit.Test;

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

        Assert.assertTrue(actualToss >= dice.numberOfDice && actualToss <= dice.numberOfDice * 6);

    }

    @Test
    public void testSumOfToss2(){
        //Given
        Dice dice = new Dice(5);

        Integer actualToss = dice.sumOfToss();

        Assert.assertTrue(actualToss >= dice.numberOfDice && actualToss <= dice.numberOfDice * 6);

    }

    @Test
    public void testSumOfToss3(){
        //Given
        Dice dice = new Dice(8);

        Integer actualToss = dice.sumOfToss();

        Assert.assertTrue(actualToss >= dice.numberOfDice && actualToss <= dice.numberOfDice * 6);

    }

}