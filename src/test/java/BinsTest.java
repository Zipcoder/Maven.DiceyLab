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

    @Test
    public void runTrialTest(){
        // Given
        Integer quantity = 3;
        Integer sides = 6;
        Integer numberOfTrials = 3;
        dice = new Dice(quantity, sides);
        bin = new Bins(dice);

        // When
        bin.runTrial(numberOfTrials);
        Integer actual = 0;
        for(Integer n:bin.getResults()){
            actual += n;
        }

        // Assert
        Integer highest = dice.getHighestRoll() * numberOfTrials;
        Integer lowest = dice.getQuantity() * numberOfTrials;
        Assert.assertTrue(actual > lowest && actual < highest);
    }
}
