import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Run {
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 1000000);
        sim.runSimulation();
        System.out.println(sim.printResults());
        try {
            sim.printToMD();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
