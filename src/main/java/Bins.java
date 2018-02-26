import java.util.TreeMap;

public class Bins {

    int minIndex;
    int maxIndex;

    TreeMap<Integer, Integer> results = new TreeMap<Integer, Integer>();

    public Bins (int minIndex, int maxIndex) {
        results = new TreeMap<Integer, Integer>();
    }

    public void addCount(int dieNumber, int count) {
        results.get(dieNumber).(count+1);
    }

}


//    Bins results = new Bins(2, 12); // for bins from 2..12
//    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
//    results.incrementBin(10); // should increment bin # 10