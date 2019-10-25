package diceylab;

import org.junit.Test;
import org.junit.Assert;

public class SimulationTest {
    @Test
    public void runSimulationTest() {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
    }
}