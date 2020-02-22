import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class DiceTest{

    @Test
    public void diceTest(){
        // Given
        Dice testDice = new Dice(2);
        Boolean expected;

        //When
        expected = (testDice.tossAndSum() >= 2) && (testDice.tossAndSum() <= 12);

        //Then
        Assert.assertTrue(expected);
    }
    @Test
    public void diceTest2(){
        // Given
        Dice testDice = new Dice(5);
        Boolean expected;

        //When
        expected = (testDice.tossAndSum() >= 5) && (testDice.tossAndSum() <= 30);

        //Then
        Assert.assertTrue(expected);
    }

    @Test
    public void diceTest3() {
        // Given
        Dice testDice = new Dice(3);
        Boolean expected;

        //When
        expected = (testDice.tossAndSum() >= 3) && (testDice.tossAndSum() <= 18);

        //Then
        Assert.assertTrue(expected);
    }

    @Test
    public void diceTest4() {
        // Given
        Dice testDice = new Dice(1);
        Boolean expected;

        //When
        expected = (testDice.tossAndSum() >= 1) && (testDice.tossAndSum() <= 6);

        //Then
        Assert.assertTrue(expected);
    }
}