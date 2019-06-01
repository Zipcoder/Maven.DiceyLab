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

    @Test
    public void defaultConstructorTest(){
        // Given
        dice = new Dice();

        // When
        Integer expected = 6;

        // Assert
        Integer actual = dice.getSides();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void contstructorTest(){
        // Given
        dice = new Dice(3,4);

        // When
        Integer expected = 4;

        // Assert
        Integer actual = dice.getSides();
        Assert.assertEquals(expected, actual);
    }
}