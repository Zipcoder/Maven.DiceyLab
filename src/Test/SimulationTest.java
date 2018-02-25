import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {




//    @Test
//    public void testRunSimulation(){
//        Simulation simulation= new Simulation(1, 1);
//        Bins bins = new Bins(1, 6);
//
//        int expected = 9;
//        int actual = (int)simulation.runSimulation();
//
//        Assert.assertTrue(expected >= actual && expected <= actual);
//
//        }

    @Test
    public void testNumberOfStars(){
        Simulation simulation = new Simulation(10, 15);

        String expected = "***";
        String actual = simulation.numberOfStars(3);

        Assert.assertEquals(expected,actual);
    }


}