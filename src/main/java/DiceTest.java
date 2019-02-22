import org.junit.Test;


import static org.junit.Assert.*;

public class DiceTest {

    @Test
    public void diceRoll() {
            Dice dice = new Dice(2);
            Boolean actual = (2 <= dice.diceRoll() && dice.diceRoll() >= 12);
            Boolean expected = (2 <= dice.diceRoll() && dice.diceRoll() >= 12);
            assertEquals(expected, actual);
        }
    }