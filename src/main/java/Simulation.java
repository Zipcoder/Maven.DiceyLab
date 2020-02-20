import java.util.ArrayList;
import java.util.logging.Logger;

public class Simulation {

    private Integer numOfRolls;
    private Integer numOfDice;
    private Dice daiso;
    private Bins bin;
    public Simulation(Integer numberOfDice, Integer numberOfRolls){
        this.numOfDice = numberOfDice;
        this.bin = new Bins(this.numOfDice, this.numOfDice*6);
        this.daiso = new Dice(this.numOfDice);
        this.numOfRolls = numberOfRolls;
    }

    public void runSimulation(){
        for (int i = 0; i < this.numOfRolls; i++) {
            this.bin.incrementBin(daiso.tossAndSum());
        }
    }

    public void printResult(){
        for (int i = this.numOfDice; i <= this.numOfDice*6; i++) {
            Integer occurance = this.bin.getBin(i);
            Double percent = Double.parseDouble(occurance.toString()) / this.bin.getTotal();
            System.out.printf("%1$2d : %2$9d: %3$.2f ", i, occurance, percent);
            int numStars = (int)(percent*100);
            for (int j = 0; j < numStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public Bins getBucket(){
        return this.bin;
    }

}
