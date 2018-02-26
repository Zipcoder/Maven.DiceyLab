import java.util.TreeMap;

public class Bins {
    private int startingBound;
    private int endingBound;
    private int[] rollSums;

    //Constructor
    public Bins(int startingBound, int endingBound) {
        rollSums = new int[endingBound+1];
    }


    //Methods
    public int getBin(int value) {
        return rollSums[value];
    }

    public void incrementBin(int value) {
        rollSums[value] = rollSums[value] + 1;
    }

}



//public class Bins{
//
//   private TreeMap<Integer, Integer> bins = new TreeMap<Integer, Integer>();
//
//    public TreeMap<Integer, Integer> getBins() {
//        return bins;
//    }
//
//    public int getBin(int binNumber){
//        return bins.get(binNumber);
//    }
//
//
//    public void incrementBin(int binNumber){
//        if (null == bins.get(binNumber)) {
//            bins.put(binNumber, 1);
//        }
//        else {
//            bins.put(binNumber, bins.get(binNumber) + 1);
//        }
//    }
//
//
//}

    //needs method for adding to bin.
    //need method for retrieving bin.
//    Bins results = new Bins(2, 12); // for bins from 2..12
//    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
//results.incrementBin(10); // should increment bin # 10
//int results = toss(1million).
