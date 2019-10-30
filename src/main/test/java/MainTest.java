import org.junit.Test;

public class MainTest {

    @Test
    public void RollSimulationTest() {

        RollSimulation.runSimulation(1, 2);
    }

    @Test
    public void printResultsTest() {
        Bins bin = RollSimulation.runSimulation(1, 2);
        Main.printResults(bin, 1);
    }

}
