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

    @Test
    public void rollTest(){
        // Given
        Integer sides = 2;
        Integer quantity = 5;
        dice = new Dice(quantity,sides);
        Integer maxRoll = dice.getHighestRoll();

        // When
        Integer result = dice.roll();

        // Assert
        Boolean expected = (result >= quantity && result <= maxRoll);
        Assert.assertTrue(expected);
    }

    @Test
    public void getHighestRoll(){
        // Given
        dice = new Dice(3,6);

        // When
        Integer actual = dice.getHighestRoll();

        // Assert
        Integer expected = 18;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setQuantityTEst(){
        // Given
        dice = new Dice();
        Integer expected = 4;

        // When
        dice.setQuantity(expected);

        // Assert
        Integer actual = dice.getQuantity();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void quantityConstructorTest(){
        // Given
        Integer quantity = 8;
        dice = new Dice(quantity);

        // When
        Integer actual = dice.getQuantity();

        // Then
        Assert.assertEquals(quantity, actual);
    }
}