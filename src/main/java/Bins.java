import java.util.TreeMap;

public class Bins {
    //The treemap will hold the starting roll, and the ending roll
    private TreeMap<Integer, Integer> sumOfRollsMap;
    private Integer startingRoll;
    private Integer endingRoll;

    //the constructor
    public Bins(Integer startingRoll, Integer endingRoll){
        sumOfRollsMap = new TreeMap<Integer, Integer>();
    }

    //methods
    public int getBin(Integer val){
        if(sumOfRollsMap.containsKey(val)){
            return sumOfRollsMap.get(val);
        }
        return 0;
    }

    public void addToBin(Integer val) {
        if (sumOfRollsMap.containsKey(val)) {
            int currentSum = sumOfRollsMap.get(val);
            sumOfRollsMap.put(startingRoll, currentSum + 1);
        } else {
            sumOfRollsMap.put(val, 1);
        }


    }
}
