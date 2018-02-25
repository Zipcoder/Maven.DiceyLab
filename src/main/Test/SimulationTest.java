import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SimulationTest {

    @Test
    public void runSimulationTest() {
        Simulation sim = new Simulation(2, 10000);
        sim.runSimulation();
        int actual = sim.bins.getBinMap().size();
        int actual1 = 0;
        int expected =  11;
        int expected1 = 10000;
        for (int e : sim.bins.getBinMap().values()) {
            actual1 += e;

        }
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected1, actual1);
    }
    @Test
    public void printResultTest() {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        System.out.println(sim.printResults());
    }

}
