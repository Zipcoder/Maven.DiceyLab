import java.util.HashMap;

public class Bins {

    private int startingPoint;
    private int endingPoint;
    protected HashMap<Integer, Integer> recordOfRolls;

    public Bins(int startingPoint, int endingPoint) {
        recordOfRolls = new HashMap<>();
        for (int i = startingPoint; i <= endingPoint; i++){
            recordOfRolls.put(i, 0);
        }
    }
    // ^ is the constructor

    public int getBin(int numberOfBin) {
        return recordOfRolls.get(numberOfBin);

    }


    public void incrementBin(int numberOfBin) {
        if (recordOfRolls.containsKey(numberOfBin)) {
            int currentSum = recordOfRolls.get(numberOfBin);
            recordOfRolls.put(numberOfBin, currentSum + 1);
            // if the key is there add the value to one
        } else {
            recordOfRolls.put(numberOfBin, 1);
            // if the key is NOT there add it and set it as one

        }


    }
}
