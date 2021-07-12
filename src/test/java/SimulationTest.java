import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {

    @Test
    public void constructorTest() {
        // Given
        Integer expectedNumberOfDies = 2;
        Integer expectedNumberOfTosses = 1000000;


        // When
        Simulation simulation = new Simulation(expectedNumberOfDies, expectedNumberOfTosses);
        Integer actualNumberOfDies = simulation.getNumberOfDies();
        Integer actualNumberOfTosses = simulation.getNumberOfTosses();

        // Then
        Assert.assertEquals(expectedNumberOfDies, actualNumberOfDies);
        Assert.assertEquals(expectedNumberOfTosses, actualNumberOfTosses);
    }
}
