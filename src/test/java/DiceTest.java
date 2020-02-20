import org.junit.Assert;
import org.junit.Test;

public class DiceTest {


    @Test
    public void DiceRollTest1Die() {
        Dice dice = new Dice(1);
        int outcome = Dice.tossAndSum();
        boolean actual = false;
        if(outcome <= 6){
            actual = true;
        }
        Assert.assertTrue(actual);
    }

    @Test
    public void DiceRollTest2Die(){
        Dice dice = new Dice(2);
        int outcome = Dice.tossAndSum();
        boolean actual = false;
        if(outcome <= 12){
            actual = true;
        }
        Assert.assertTrue(actual);
    }
}
