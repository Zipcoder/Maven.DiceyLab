import java.util.Arrays;

public class Simulation {
    private Bins bin;
    private Dice dice;
    private Integer numberOfTosses;
    private Integer numberOfDies;



    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfTosses = numberOfTosses;
        dice = new Dice( numberOfDies );
        bin = new Bins( numberOfDies, (numberOfDies * 6));
        this.numberOfDies = numberOfDies;
    }

    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            Integer t = dice.tossAndSum();
            bin.incrementBin(t);
        }
    }

    public void printResults(){
        StringBuilder toPrint = new StringBuilder("***\nSimulation of 2 dice tossed for 1Mx.\n***\n\n");
        Integer valueOfRange;
        for (int i = numberOfDies; i < bin.lengthArray + numberOfDies + 1; i++) {
            valueOfRange = bin.getBin(i);
            toPrint.append(
                String.format("%2d", i))
                .append(" : ")
                .append(String.format("%8d", valueOfRange)).append(" : ")
                .append(String.format("%5.2f", ((float) valueOfRange / (float) numberOfTosses)))
                .append(" ")
                .append(asterisks(100 * valueOfRange / numberOfTosses)).append("\n");
        }
        System.out.println( toPrint );
    }

    public String asterisks(Integer sample){
        return "*".repeat(sample);
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2,1000000);
        sim.runSimulation();
        sim.printResults();

    }

}
