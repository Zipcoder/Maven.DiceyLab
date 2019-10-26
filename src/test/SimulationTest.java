import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SimulationTest{

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSimulation(){
        Simulation newSimulation = new Simulation(2,999);
        newSimulation.printResults(newSimulation.runSimulation());
    }

}