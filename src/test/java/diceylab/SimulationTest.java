package diceylab;

import org.junit.Test;
import org.junit.Assert;

public class SimulationTest {
    @Test
    public void runSimulationTest() {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
    }

    @Test
    public void normalizeResultsTest() {
        Simulation sim = new Simulation(2, 1000000);
        Bins bins = new Bins(2);

//        Double[] actual = sim.normalizeResults(bins);
//        Double
    }

    @Test
    public void printResultsTest() {
        Simulation sim = new Simulation(2, 100000);
//        sim.printResults();
    }

    @Test
    public void getStarsTest1() {
        Simulation sim = new Simulation(2, 10);
        String expected = "**";
        String actual = sim.getStars(0.02);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getStarsTest2() {
        Simulation sim = new Simulation(2, 10);
        String expected = "**********";
        String actual = sim.getStars(0.10);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getStarsTest3() {
        Simulation sim = new Simulation(2, 10);
        String expected = "********";
        String actual = sim.getStars(0.08);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getTotalTest() {

    }
}