import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void tossAndSum() {
        Dice die = new Dice(1);
        Integer toss = die.tossAndSum();
        assertTrue(toss > 0 && toss < 7);
    }

    @Test
    void TestRNG() {
        Dice die = new Dice(10, new Long(4));
        Integer toss = die.tossAndSum();
        assertEquals(35, toss);
    }
}