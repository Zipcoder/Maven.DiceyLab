import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DiceTest {

    @Test
    public void testDiceConstructor () {
    int numOfDie = 2;
    Dice dice = new Dice(numOfDie);

    Integer testInt = dice.tossAndSum();

    System.out.println(testInt);
    Assert.assertTrue(testInt < 13 && testInt > 1);
    }
}
