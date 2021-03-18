import java.util.Map;
import java.util.HashMap;


public class Bins {
    Map<Integer, Integer> mapOfBins = new HashMap<>();


    public Bins(int lowestBinNumber, int highestBinNumber) {

        for (int i = lowestBinNumber; i <= highestBinNumber; i++) {
            mapOfBins.put(i, 0);
        }
    }
    public Integer getBin(int binNumber) {
        return mapOfBins.get(binNumber);



    }

}
