import javax.sound.midi.Soundbank;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

public class Simulation {

    private Integer numberOfThrows;
    private Dice dice;
    private Bins bins;
    private int numberOfDie;
    protected Simulation simulation;

    public Simulation(int numberOfDie, int numberOfThrows) {
        this.numberOfThrows = numberOfThrows;
        this.dice = new Dice(2);
        this.bins = new Bins(numberOfDie, numberOfDie * 6);
    }
        public void runSimulation() {
            for (int i = 0; i < numberOfThrows; i++) {
                int value = dice.diceRoll();
                bins.incrementBin(value);

            }
        }

    public String simulationToString() {
        StringBuilder sb = new StringBuilder();
        for (Integer keys:bins.recordOfRolls.keySet()) {
            sb.append(keys +":     "+ bins.recordOfRolls.get(keys) + "\n");
        }

        return sb.toString();
    }

    public String getPercentage(){
       StringBuilder sb = new StringBuilder();
        Double sum = 0.0;
        for (Integer i : bins.recordOfRolls.values()){
             sum += i;
        }
        for (Integer keys : bins.recordOfRolls.values()) {
            Double percent = keys / sum;
            sb.append(percent);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 10000);
        sim.runSimulation();
       System.out.println(sim.simulationToString());
        System.out.println(sim.getPercentage());

    }


}
