import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sun.jvm.hotspot.utilities.Assert;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {
    private static final Logger LOGGER =
            Logger.getLogger((BinsTest.class.getName()));
    @Test
    public void incrementBinTest(){
        Bins testBins = new Bins(2, 12);
        Dice testDice = new Dice(2);
        Integer roll = testDice.tossAndSum();
        testBins.incrementBin(roll);
        Integer expected = 1;
        Integer actual = testBins.getBin(roll);
        LOGGER.info("roll is: " + roll + " binRoll: " + actual);
        Assertions.assertEquals(expected, actual);
    }
}