import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void tossAndSumTest() {
        // Given
        Integer numberOfDice = 2;

        // When
        Dice dice = new Dice(numberOfDice);
        Integer sumOfDice = dice.tossAndSum();

        // Then
        Assert.assertTrue(sumOfDice >= numberOfDice && sumOfDice <= numberOfDice * 6);
    }

    @Test
    public void tossAndSumTest1() {
        // Given
        Integer numberOfDice = 4;

        // When
        Dice dice = new Dice(numberOfDice);
        Integer sumOfDice = dice.tossAndSum();

        // Then
        Assert.assertTrue(sumOfDice >= numberOfDice && sumOfDice <= numberOfDice * 6);
    }

    @Test
    public void constructorTest() {
        // Given
        Integer expectedNumberOfDice = 4;
        Dice dice = new Dice(expectedNumberOfDice);


        // When
        Integer actualNumberOfDice = dice.getNumberOfDice();

        // Then
        Assert.assertEquals(expectedNumberOfDice, actualNumberOfDice);
    }

}
