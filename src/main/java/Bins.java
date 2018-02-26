import java.util.TreeMap;

public class Bins {

    int minIndex;
    int maxIndex;

    private int[] results;

    public Bins (int minIndex, int maxIndex) {
        results = new int[maxIndex +1];
    }

    public int getBins(int outcome) {
        return results[outcome];
    }

    public void incrementBin(int outcome) {
        results[outcome]++;
    }

}


//    Bins results = new Bins(2, 12); // for bins from 2..12
//    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
//    results.incrementBin(10); // should increment bin # 10