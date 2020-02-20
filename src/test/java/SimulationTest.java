import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {

    private static final Logger LOGGER =
            Logger.getLogger((BinsTest.class.getName()));

    @Test
    public void test(){
        Simulation test = new Simulation(2, 50);
        test.runSimulation();
        for (int i = 0; i <= 12; i++) {
            LOGGER.info(" " + test.getBucket().getBin(i));
        }
    }

}