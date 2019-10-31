import java.util.TreeMap;
public class Bins
{

    private TreeMap<Integer, Integer> bintreemap ;

    private int numberOfDice;

    private static final int ZERO = 0;

    // Constructor initialize the fields
    public Bins( int numberOfDice) {
        this.bintreemap = new TreeMap < Integer, Integer> ();
        this.numberOfDice = numberOfDice;
        initializeBinTreeMap();
    }

    // Create and initiate the Bins with ZERO
    private void initializeBinTreeMap () {

        int numberOfBins = numberOfDice * 6;
        for (int i=this.numberOfDice; i<=numberOfBins; i++) {
            this.bintreemap.put(i, ZERO);
        }
    }

    public Integer getBin (Integer inputBinNo) {

        Integer result = bintreemap.get(inputBinNo);

        return result;
    }

    public void incrementBin (Integer binNumber) {
        Integer result = bintreemap.getOrDefault(binNumber, ZERO);
        result++;
        bintreemap.put(binNumber, result);
    }

}
