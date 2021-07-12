import java.util.HashMap;
import java.util.Map;

public class Bins {
//map<key,value>
    Map<Integer, Integer> mapOfBins = new HashMap<>();
    private Integer minimumNumber;
    private Integer maximumNumber;


    public Bins(int minimumNumber, int maximumNumber) {
        this.minimumNumber = minimumNumber;
        this.maximumNumber = maximumNumber;
        for (int i = minimumNumber; i <= maximumNumber; i++) {
            mapOfBins.put(i, 0);
        }
    }
    public Integer getBin(int binNumber) {
        return mapOfBins.get(binNumber);
    }
    public void incrementBin(Integer binNumber) {
        if (binNumber >= this.minimumNumber && binNumber <= this.maximumNumber) {
            Integer currentBinResult = this.getBin(binNumber);
            this.mapOfBins.put(binNumber, currentBinResult + 1);//
        }
    }

}
