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
    public void normalizeResultsTest1() {
        Simulation sim = new Simulation(2, 1000000);
        Bins bins = new Bins(2);
        for (int i = 0; i < 100; i++) {
            bins.incrementBin(10);
            bins.incrementBin(5);
        }
        Double actual = sim.normalizeResults(bins)[10];
        Double expected = 0.5;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void normalizeResultsTest2() {
        Simulation sim = new Simulation(2, 1000000);
        Bins bins = new Bins(2);
        for (int i = 0; i < 100; i++) {
            bins.incrementBin(10);
            bins.incrementBin(5);
            bins.incrementBin(3);
        }
        double actual = sim.normalizeResults(bins)[10];
        double expected = 0.333;
        Assert.assertEquals(expected, actual, 2);
    }

    @Test
    public void normalizeResultsTest3() {
        Simulation sim = new Simulation(2, 1000000);
        Bins bins = new Bins(2);
        for (int i = 0; i < 100; i++) {
            bins.incrementBin(10);
            bins.incrementBin(5);
            bins.incrementBin(4);
            bins.incrementBin(3);
        }
        Double actual = sim.normalizeResults(bins)[10];
        Double expected = 0.25;
        Assert.assertEquals(expected, actual);
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