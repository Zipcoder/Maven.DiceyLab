public class App {

    public static void main(String[] args) {
        Simulation simulation = new Simulation(2, 1000000);
        simulation.runSimulation();
        simulation.printResults();
    }
}
