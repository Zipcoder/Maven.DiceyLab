import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    private Dice dice;

    @Test
    public void setSides() {
        // Given
        dice = new Dice();

        // When
        Integer expected = 7;
        dice.setSides(expected);

        // Assert
        Integer actual = dice.getSides();
        Assert.assertEquals(expected, actual);
    }
}