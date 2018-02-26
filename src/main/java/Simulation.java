import java.util.TreeMap;

public class Simulation {

    public String Simulation(Bins bins, Integer numberOfRolls) {

        String printSimulationResults = "***\nSimulation of " + bins.getNumberOfDice() + " dice tossed for " + numberOfRolls +
                " times.\n***\n";

        for(int i = 2; i <= bins.getNumberOfKeys(); i++){

            String keyValue=String.format("%2d", i);
            String numberOfValue = String.format("%10d", bins.countTotals.get(i));
            String percentOfTotal = String.format("%.2f", (bins.countTotals.get(i).floatValue() / numberOfRolls.floatValue()));

            int amountOfStars = (int)Math.floor((bins.countTotals.get(i).floatValue() / numberOfRolls.floatValue() *100));
            String starString = printStars(amountOfStars);
            printSimulationResults+= keyValue+ " : "+ numberOfValue+" : " + percentOfTotal+ " " +starString+ "\n";
        }
        return printSimulationResults;
    }

    private String printStars(int amountOfStars) {
        String starString="";
        for(int i =0; i< amountOfStars; i++){
            starString+= "*";
        }
        return starString;
    }

}
