import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    private static final Logger LOGGER =
            Logger.getLogger((DiceTest.class.getName()));
    Dice testDice;

    @BeforeEach
    public void init(){
        testDice = new Dice(2);
    }

    @Test
    public void getTossAndSumTest(){
        Long seed = 2l;
        Random rand = new Random(seed);
        Integer expected = 7;
        Integer actual = testDice.tossAndSum();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        Bins testBin = new Bins(2, 12);
        for (int i = 0; i < 20; i++) {
            Integer testRoll = testDice.tossAndSum();
            testBin.incrementBin(testRoll);
            if(testRoll < 12)
                LOGGER.info("testRoll : " + testRoll
                + " bin: " + testBin.getBin(testRoll));
        }
    }
}