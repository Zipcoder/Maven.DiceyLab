import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

public class Simulation {

    private Integer numberOfThrows;
    private Dice dice;
    private Bins bins;
    private int numberOfDie;

    public Simulation(int numberOfDie, int numberOfThrows) {
        this.numberOfThrows = numberOfThrows;
        this.dice = new Dice(2);
        this.bins = new Bins(numberOfDie, numberOfDie * 6);
    }

//
//    public void simulationToString() {
//        StringBuilder sb = new StringBuilder();
//        for (Map.Entry entry : bins.incrementBin) {
//            System.out.println(entry + "\n");
//        }
//    }
        public void runSimulation() {
            for (int i = 0; i < numberOfThrows; i++) {
                int value = dice.diceRoll();
                bins.incrementBin(value);

            }
        }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 10);
        sim.runSimulation();
//        sim.simulationToString();
    }


}
