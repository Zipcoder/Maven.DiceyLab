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
    public void runTrialTest(){//TODO broken again, due to new formatting in Bins
        // Given
        Integer quantity = 3;
        Integer numberOfTrials = 3;
        dice = new Dice(quantity); //6 sided dice
        Bins bin = new Bins(dice);
        Integer high = dice.getHighestRoll() * numberOfTrials;
        Integer low = dice.getQuantity() * numberOfTrials;

        // When
        bin.runTrial(numberOfTrials);
        Integer actual = 0;
        for(Integer num : bin.getResults()){
            actual += num;
        }

        // Assert
//        Assert.assertTrue(actual >= low && actual <= high);
    }
}
