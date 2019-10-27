import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {

    @Test
    public void runSimTest() {
        Simulation simulation = new Simulation();
        simulation.run();
    }

    @Test
    public void printResultTest() {
        Simulation simulation = new Simulation(5,1000000);
        simulation.run();
        simulation.printResults();
    }
}