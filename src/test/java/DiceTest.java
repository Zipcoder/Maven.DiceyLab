import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    @Test
    public void rollTest() {
        //Given
            //a Dice Object and supply number of dice
            Dice testDice = new Dice(2);
        //When
            //I roll it/them
        testDice.rollDice(2);
        //Then
            //I want it to give me a random number
        int actual = testDice.rollDice(2);

        Assert.assertTrue(actual >=12);
    }
}
