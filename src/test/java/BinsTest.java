import org.junit.Assert;
import org.junit.Test;

public class BinsTest {

    @Test
    public void constructorTest() {
        // Given
        Integer expectedStartingBin = 2;
        Integer expectedEndingBin = 12;
        Bins results = new Bins(expectedStartingBin, expectedEndingBin);


        // When
        Integer actualStartingBin = results.getStartingBin();
        Integer actualEndingBin = results.getEndingBin();

        // Then
        Assert.assertEquals(expectedStartingBin, actualStartingBin);
        Assert.assertEquals(expectedEndingBin, actualEndingBin);
    }
}
