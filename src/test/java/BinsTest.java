import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    private Bins bin;
    private Dice dice;

    @Test
    public void binsConstructorTest(){
        // Given
        Integer sides = 5;
        Integer quantity = 5;
        dice = new Dice(quantity, sides);
        bin = new Bins(dice);

        // When
        Integer actual = bin.getResults().length;

        // Assert
        Integer expected = dice.getHighestRoll() + 1;
        Assert.assertEquals(expected, actual);
    }
}
