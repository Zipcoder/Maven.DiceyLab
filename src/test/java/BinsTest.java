import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void testBins() {
        // Given
        int testMin = 2;
        int testMax = 12;
        int expected = testMax - testMin + 1;

        // When
        Bins testBin = new Bins(testMin, testMax);
        int actual = testBin.sumOfRolls.length;

        // Then
        Assert.assertEquals(expected, actual);
    }
}
