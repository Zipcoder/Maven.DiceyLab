import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {
    @Test
    public void dicesRolledTest(){
        Integer expected = 2;
        Dice lilDice = new Dice (expected);
        Integer actual = lilDice.getNumOfDicesRolled();
        Assert.assertEquals(expected, actual);
    }
//    @Test
//    public void diceRollTest();
//
//    Assert.assertEquals(expected, actual);

}