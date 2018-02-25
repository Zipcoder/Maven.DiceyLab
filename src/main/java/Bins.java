import java.util.HashMap;

public class Bins {

    protected HashMap<Integer, Integer> keepTrack;

    /**
     * Note to self could refactor to make hashmap private by creating a method that returns the keys and one that
     * returns the values
     */
    public Bins(Integer minDiceRange, Integer maxDiceRange) {

        // Create hashmap put min in first key add one till hit the last key which is max.
        this.keepTrack = new HashMap<Integer, Integer>();
        for (Integer i = minDiceRange; i <= maxDiceRange; i++) {
            keepTrack.put(i, 0);
        }
    }

    // roll dice and add 1 to the value of the key that was just rolled
    public void incrementBin(Integer rollValue) {
        Integer currentBinCount = keepTrack.get(rollValue);
        keepTrack.put(rollValue, currentBinCount + 1);

    }

    //retrieve count for any key and return
    public Integer getBin(Integer rollValue) {
        return keepTrack.get(rollValue);
    }

    public static void main(String[] args) {
        Bins results = new Bins(2, 12);
        results.incrementBin(10);
        results.incrementBin(10);
        Integer numberOfTens = results.getBin(10);
        System.out.println(numberOfTens);

    }


}
