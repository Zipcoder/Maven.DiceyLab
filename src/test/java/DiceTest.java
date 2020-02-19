import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void tossAndSum() {
        Dice die = new Dice(1);
        Integer toss = die.tossAndSum();
        assertTrue(toss > 0 && toss < 7);
    }
}