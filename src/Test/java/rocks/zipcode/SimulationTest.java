package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {

    @Test
    public void SimulationTest(){

        Simulation sim = new Simulation(3, 1000000);
        sim.runSimulation();
        int actual = sim.diceTable.getBins(2);
        int expected = 0;
        int actual1 = sim.diceTable.getBins(3);


        Assert.assertTrue(actual1>0);
        Assert.assertEquals(expected,actual);


    }
}
