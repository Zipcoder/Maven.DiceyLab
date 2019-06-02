import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

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

    @Test
    public void runTrialTest(){
        // Given
        Integer quantity = 5;
        Integer numberOfTrials = 5;
        dice = new Dice(quantity);
        bin = new Bins(dice);

        // When
        Integer actual = 0;
        bin.runTrial(numberOfTrials);
        for(Integer num : bin.getResults()){
            actual += num;
        }

        // Assert
        Assert.assertEquals(numberOfTrials, actual);
    }
}
