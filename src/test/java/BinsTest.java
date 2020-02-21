import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinsTest {

    @Test
    void getBin() {
        Bins bin = new Bins(1, 10);
        bin.incrementBin(1);
        assertNotNull(bin.getBin(1));
    }

    @Test
    void incrementBin() {
        Bins bin = new Bins(1, 10);
        bin.incrementBin(1);
        bin.incrementBin(1);
        int actual = bin.getBin(1);
        int expected = 2;
        assertEquals(expected, actual);

    }

    @Test
    void sumOfResults() {
        Bins bin = new Bins(1, 10);
        bin.incrementBin(1);
        bin.incrementBin(1);
        int actual = bin.sumOfResults();
        int expected = 2;
        assertEquals(expected, actual);
    }
}