import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DiceTest {

    public void setUp(){

    }
    @Test
    public void diceRollTest(){
        Dice dice = new Dice(2);
        int actual = dice.diceRoll();
        Assert.assertTrue(actual >= dice.numberOfDice && actual <= dice.numberOfDice*6);
    }

}
