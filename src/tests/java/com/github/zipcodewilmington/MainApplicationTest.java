package com.github.zipcodewilmington;

public class MainApplicationTest {
    public static void main (String[] args) {
        Integer numberOfDie = 2;
        Integer numberOfTosses = 1000000;
        Simulation simulation = new Simulation(numberOfDie, numberOfTosses);
        simulation.run();
        simulation.printResults();
    }
}
