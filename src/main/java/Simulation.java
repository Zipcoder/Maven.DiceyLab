import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;
import java.io.File;
public class Simulation {

    Bins bins = new Bins();
    Dice dice;

    int numberOfDies;
    int numberOfTosses;

    public Simulation(int numberOfDies, int numberOfTosses) {
        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
    }

    public void runSimulation() {
        dice = new Dice(numberOfDies);
        for (int i = 0; i < numberOfTosses; i++) {
            bins.incrementBin(dice.tossAndSum());
        }
    }

    public String printResults() {
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append("***\n" +
                "Simulation of " + numberOfDies + " dice tossed for " + numberOfTosses + " times.\n" +
                "***\n\n");
        TreeMap<Integer, Integer> resultMap = bins.getBinMap();
        for (Integer binNumber : resultMap.keySet()) {
            String starBar = "";
            for (int i = 0; i < resultMap.get(binNumber) / (float) numberOfTosses * 100; i++) {
                starBar += "*";
            }
            resultBuilder.append(String.format("%2d : %9d: %.2f %s\n", binNumber, resultMap.get(binNumber), (resultMap.get(binNumber) / (float) numberOfTosses), starBar));
        }
        return resultBuilder.toString();
    }

    public void printToMD() throws IOException {
        final File file = new File(
                "/Users/petermccormick/Dev/Peter/DiceyLab/src/main/Resources/PeterResults.md");

        FileWriter fWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fWriter);
        writer.write(printResults());
        writer.close();
    }
}
