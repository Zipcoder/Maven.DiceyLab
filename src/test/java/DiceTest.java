import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testDice() {
        // Given
        int numberOfDice = 2;
        Dice testDice = new Dice(numberOfDice);

        // When
        Integer test = testDice.tossAndSum();

        // Then
        Assert.assertTrue(test < 13 && test > 1);
    }

}
