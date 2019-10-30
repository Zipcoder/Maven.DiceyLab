package com.github.zipcodewilmington;

public class MainApplication {
    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 99999);
        sim.run();
        sim.printResults();
    }
}
