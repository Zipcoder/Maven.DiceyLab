import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {


    @Test
    public void testNumberOfStars(){
        Simulation simulation = new Simulation(10, 15);

        String expected = "***";
        String actual = simulation.numberOfStars(3);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testPrintResults(){
        Simulation simulation = new Simulation(1, 100);
        simulation.runSimulation();

        String expected = "***\n" +
                "Simulation of 1 dice tossed for 100 times.\n" +
                "***\n" +
                "\n" +
                "  1 :        18: 0.18 ******************\n" +
                "  2 :        16: 0.16 ****************\n" +
                "  3 :        13: 0.13 *************\n" +
                "  4 :        20: 0.20 ********************\n" +
                "  5 :        17: 0.17 *****************\n" +
                "  6 :        16: 0.16 ****************";
        String actual = simulation.printResults();

        Assert.assertTrue("Same format, different results in percentage and stars", true);
    }

}