import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {

    @Test
    public void runSimulation() {
    }

    @Test
    public void testAsterisks()
    {
        Simulation simulation = new Simulation(2, 10);

        String expected = "****";

        String actual = simulation.asterisks(4);

        Assert.assertEquals(expected, actual);
    }


}