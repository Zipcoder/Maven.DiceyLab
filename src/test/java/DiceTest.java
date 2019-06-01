import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {



    @Test
    public void defaultConstructorTest(){
        Dice dice = new Dice();
        Integer expected = 1;

        Integer actual = dice.getNumberOfDice();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void constructorTest(){
        Integer expected = 2;
        Dice dice = new Dice(expected);

        Integer actual = dice.getNumberOfDice();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void rollTest1() {
        Integer numDice = 2;
        Dice dice = new Dice(numDice);
        Boolean valid = true;

        for(int i = 0; i < 10000; i++){
            Integer result = dice.roll();

            if(result < 2 || result > 12){
                valid = false;
                break;
            }
        }
        Assert.assertTrue(valid);
    }

    @Test
    public void rollTest2(){
        Dice dice = new Dice();
        Boolean valid = true;

        for(int i = 0; i < 10000; i++){
            Integer result = dice.roll(3);
            if(result < 3 || result > 18){
                valid = false;
                break;
            }
        }

        Assert.assertTrue(valid);
    }
}