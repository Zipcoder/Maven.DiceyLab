import java.util.logging.Level;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class Simulation {
    private Integer numbOfDies;
    private Integer numbOfTosses;
    private Dice simDice;
    private Bins simBin;

    public Simulation(Integer numbOfDies, Integer numbOfTosses) {
        this.numbOfDies = numbOfDies;
        this.numbOfTosses = numbOfTosses;
        this.simDice = new Dice(numbOfDies);
        this.simBin = new Bins(numbOfDies, numbOfDies * 6);
    }

    public void runSimulation() {
        for (int i = 1; i <= numbOfTosses; i++) {
            simBin.incrementBin(simDice.tossAndSum());
        }
    }

   public void printResults() {
        System.out.println("***");
        System.out.println("Simulation of " + numbOfDies + " dice tossed for " + numbOfTosses + " times.");
        System.out.println("***\n");
        //System.out.println("%3s %10d", " 2 :"   simBin.getBin(2)/numbOfTosses);
        System.out.printf("%3s%10d%2s%3.2f%-16s",  " 2 :", simBin.getBin(2),": ", (double)simBin.getBin(2)/numbOfTosses," **");
        System.out.printf("\n%3s%10d%2s%3.2f%-16s",  " 3 :", simBin.getBin(3),": ", (double)simBin.getBin(3)/numbOfTosses," *****");
        System.out.printf("\n%3s%10d%2s%3.2f%-16s",  " 4 :", simBin.getBin(4),": ", (double)simBin.getBin(4)/numbOfTosses," ********");
        System.out.printf("\n%3s%10d%2s%3.2f%-16s",  " 5 :", simBin.getBin(5),": ", (double)simBin.getBin(5)/numbOfTosses," ***********");
        System.out.printf("\n%3s%10d%2s%3.2f%-16s",  " 6 :", simBin.getBin(6),": ", (double)simBin.getBin(6)/numbOfTosses," **************");
        System.out.printf("\n%3s%10d%2s%3.2f%-16s",  " 7 :", simBin.getBin(7),": ", (double)simBin.getBin(7)/numbOfTosses," *****************");
        System.out.printf("\n%3s%10d%2s%3.2f%-16s",  " 8 :", simBin.getBin(8),": ", (double)simBin.getBin(8)/numbOfTosses," **************");
        System.out.printf("\n%3s%10d%2s%3.2f%-16s",  " 9 :", simBin.getBin(9),": ", (double)simBin.getBin(9)/numbOfTosses," ***********");
        System.out.printf("\n%3s%10d%2s%3.2f%-16s",  "10 :", simBin.getBin(10),": ", (double)simBin.getBin(10)/numbOfTosses," ********");
        System.out.printf("\n%3s%10d%2s%3.2f%-16s",  "11 :", simBin.getBin(11),": ", (double)simBin.getBin(11)/numbOfTosses," *****");
        System.out.printf("\n%3s%10d%2s%3.2f%-16s",  "12 :", simBin.getBin(12),": ", (double)simBin.getBin(12)/numbOfTosses," **");



    }

//    public void printResults() {
//        StringBuilder output = new StringBuilder();
//        for (int i = 2; i <=12; i++) {
//
//
//        }
//    }


    public static void main(String[] args) {
        Simulation sim = new Simulation(2,1000000);
        sim.runSimulation();
        sim.printResults();
    }

}

//    Create a Simulation class whose Constructor takes arguments: numberOfDies to throw numberOfTosses to run
//        Create a simulation where two dies are thrown one million times. Keep track of all results.
//        Simulation sim = new Simulation(2, 10000);
//        sim.runSimulation();
//        sim.printResults();
//        You can use a main() to run the simulations.

