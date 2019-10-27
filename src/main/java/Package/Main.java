package Package;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args){

        Simulation sim = new Simulation(2,10000000);
        sim.runSimulation();
        sim.printSimulation();
    }


}
