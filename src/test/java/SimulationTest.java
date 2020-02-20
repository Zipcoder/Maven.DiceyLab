import org.junit.Assert;
import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SimulationTest {
    private static Logger logger = Logger.getLogger("Dice");

    @Test
    public void simulateTestGetPercentage(){
        int noOfRolls = 20;
        Simulation sim = new Simulation(2,noOfRolls);
        sim.runSimulation();
        int noOfNs = sim.bin.getBin(6);
        double expected = (noOfNs + .00d)/(noOfRolls + .00d);

        double actual = sim.getPercentage(noOfNs);
        logger.log(Level.INFO,"Percentage of Ns in " + noOfRolls + " rolls = " + actual +" " +expected);
        logger.log(Level.INFO, String.valueOf(noOfNs));
        Assert.assertEquals(expected, actual, .000);
    }

}
