import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Simulation sim = new Simulation(2,1000000);

        sim.runSim();

        System.out.println(sim.printSim());

        try {
            sim.printSimToFile("RobertResults.md");
        } catch ( IOException e){
            System.out.println("IOException");
            System.out.println(e.toString());
        }
    }
}
