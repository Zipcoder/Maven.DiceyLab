import org.junit.Test;
import org.junit.Assert;

public class DiceTests {

    @Test
    public void DiceConstructorTest(){

        Dice diceLeastTest = new Dice(4);
        int expectedNumOfDice = 4;
        int actualNumOfDice = diceLeastTest.diceNum;

        Assert.assertEquals(expectedNumOfDice, actualNumOfDice);

    }

    @Test
    public void leastSumTest(){

        Dice diceLeastTest = new Dice(4);

        int excpectedLeast = 4;
        int actualLeast = diceLeastTest.leastSum();

        Assert.assertEquals(excpectedLeast, actualLeast);

    }

    @Test
    public void maxSumTest(){

        Dice diceMaxTest = new Dice(4);

        int excpectedMax = 4 * 6;
        int actualMax = diceMaxTest.maxSum();
        Assert.assertEquals(excpectedMax, actualMax);
    }

}
