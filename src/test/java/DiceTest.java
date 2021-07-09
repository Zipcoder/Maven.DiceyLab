import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DiceTest {

    @Test
    public void diceConstructorTest () {
        // Given
        Integer expectedRolls = 20;
        Dice dice = new Dice(2, 20);

        // When
        Integer actualRolls = dice.getNumberOfRolls();

        // Then
        Assert.assertEquals(expectedRolls, actualRolls);
    }

    @Test
    public void sumForCrapsInList () {
        List<Integer> diceContainerForCraps = new ArrayList<Integer>();
        Integer numberOfRolls = 20;
        Dice dice = new Dice(2, numberOfRolls);

        List result = dice.tossAndSumForCraps(2, numberOfRolls);

    //    System.out.println(result);
        System.out.println(dice.diceContainerForCraps);
    }
}
