import java.util.HashMap;

/*Create a tracking class Bins that can be used to track these results.

Bins results = new Bins(2, 12); // for bins from 2..12
Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
results.incrementBin(10); // should increment bin # 10

make a couple unit tests for the Bins class.

*/

public class Bins {
   //starting bound = x (number of die);
    //ending bound = x * 6 (the total possible sum of the roll toss)
    private int startingBound;
    private int endingBound;

    private int[] rollSums;

//Constructor
    public Bins(int startingBound, int endingBound) {
        rollSums = new int[endingBound+1];
    }

    public int getBin(int value) {
        return rollSums[value];
    }

    public void incrementBin(int value) {
        rollSums[value] = rollSums[value] + 1;

    }
}

//can ALSO use a HashMap to achieve the same results
/*
public class Bins {
//    HashMap to store the key(sum of a single roll of 2 die) and value(occurrances of the key)
     private HashMap<Integer, Integer> rollSumMap;
//    starting bound = x (number of die);
//    ending bound = x * 6 (the total possible sum of the roll toss)
    private int startingBound;
    private int endingBound;


    //Constructor
    public Bins(int startingBound, int endingBound) {
        rollSumMap = new HashMap<Integer, Integer>();
    }

    public int getBin(int value) {
        if (rollSumMap.containsKey(value)) {
            return rollSumMap.get(value);
        }
        return 0;
    }

    public void incrementBin(int value) {
        if (rollSumMap.containsKey(value)) {
            int currentSum = rollSumMap.get(value);
            rollSumMap.put(value, currentSum + 1);
        } else {
            rollSumMap.put(value, 1);
        }

    }
}
*/