import org.junit.Assert;
import org.junit.Test;

public class DiceClassTest {

        Integer numberOfDie;
        @Test
        public void rollDiceTest(){
            numberOfDie = 2;
            Dice dice = new Dice(numberOfDie);
            int actual = dice.tossAndSum();

            Assert.assertTrue(2 <= actual && actual <= 12);
        }
    }

