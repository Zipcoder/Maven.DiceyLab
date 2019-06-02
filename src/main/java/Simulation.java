import java.util.Arrays;

public class Simulation {
    public static void main(String[] args) {
        Dice dice = new Dice(3);
        Bins bin = new Bins(dice);

        bin.runTrial(3);

        Arrays.toString(bin.getResults());
    }
}
