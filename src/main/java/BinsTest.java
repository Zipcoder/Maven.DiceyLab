import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {

    @Test
    public void createBin() {
        Dice dice = new Dice(2);
        Bins bins = new Bins(dice);

        bins.createBin();
        Integer actual = bins.countTotals.size();
        Integer expected = 11;
        assertEquals(expected, actual);
    }

    @Test
    public void countPlacedIntoBin() {
        Dice dice = new Dice(2);
        Bins bins = new Bins(dice);

        bins.countPlacedIntoBin(dice, 100);
        int actualSum = 0;
        int expectedSum = 100;

        for(int i = 2; i <=12; i++) {
            actualSum += bins.countTotals.get(i);
        }
        assertEquals(expectedSum, actualSum);
    }
}