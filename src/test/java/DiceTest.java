import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void testDiceConstructor(){
        //given
        int numOfDie = 2;
        Dice dice = new Dice(numOfDie);

        //when
        Integer testInt = dice.tossAndSum();

        //then
        System.out.println(testInt); //should be a number between 2 and 12
        Assert.assertTrue(testInt < 13 && testInt > 1);
    }
}
