import org.junit.Test;

import static org.junit.Assert.*;

public class SimulationTest {

    @Test
    public void simulation() {
        Simulation simulation = new Simulation();
        Dice dice = new Dice(2);
        Bins bins = new Bins(dice);
        bins.countPlacedIntoBin(dice, 1000000);
        System.out.println(simulation.Simulation(bins, 1000000));
    }
}