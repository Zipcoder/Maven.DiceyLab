import java.util.TreeMap;

public class Bins {

    private TreeMap<Integer, Integer> binMap = new TreeMap<Integer, Integer>();

    public TreeMap<Integer, Integer> getBinMap() {
        return binMap;
    }

    public int getBin(int binNumber) {
        return binMap.get(binNumber);

    }

    public void incrementBin(int binNumber) {
        if (null == binMap.get(binNumber)) {
            binMap.put(binNumber, 1);
        }
        else {
            binMap.put(binNumber, binMap.get(binNumber) + 1);
        }
    }
}
