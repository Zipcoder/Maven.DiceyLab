import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {

    @Test
    public void runSimulation() {



    }

    public static class DiceTest {

        @Test
        public void rollDice() {
            Dice dice = new Dice();

            Integer actual = dice.rollDice(2);

            Assert.assertTrue(actual >= 2 && actual <= 12);



        }
    }
}