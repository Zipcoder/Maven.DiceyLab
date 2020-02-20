import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

class SimulationTest {

    @Test
    void runSimulation() {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation(true);
        ArrayList<Integer> results = sim.getAllResults();
        ArrayList<Integer> expectedResults = new ArrayList<>();
        expectedResults.add(27505);
        expectedResults.add(55282);
        expectedResults.add(83058);
        expectedResults.add(111529);
        expectedResults.add(138819);
        expectedResults.add(166218);
        expectedResults.add(138965);
        expectedResults.add(111558);
        expectedResults.add(83701);
        expectedResults.add(55439);
        expectedResults.add(27926);
        boolean actual = true;
        for (int i = 0; i < results.size(); i++) {
            if (!results.get(i).equals(expectedResults.get(i))) {
                actual = false;
                break;
            }
        }
        assertTrue(actual);
    }

    @Test
    void printResults() {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation(true);
        String actual = sim.printResults();
        String expected =
                "2 : 27505: 0.03 **\n" +
                "3 : 55282: 0.06 **\n" +
                "4 : 83058: 0.08 **\n" +
                "5 : 111529: 0.11 **\n" +
                "6 : 138819: 0.14 **\n" +
                "7 : 166218: 0.17 **\n" +
                "8 : 138965: 0.14 **\n" +
                "9 : 111558: 0.11 **\n" +
                "10 : 83701: 0.08 **\n" +
                "11 : 55439: 0.06 **\n" +
                "12 : 27926: 0.03 **\n";

        assertEquals(expected, actual);
    }
}