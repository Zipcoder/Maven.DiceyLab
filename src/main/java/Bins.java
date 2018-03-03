import java.util.HashMap;

public class Bins {

    protected HashMap<Integer, Integer> numOfTimesWeveRolledEachNUm = new HashMap<Integer, Integer>();

    public Bins(Integer smallestPossible, Integer largestPossible){
        for (Integer key = smallestPossible; key <= largestPossible; key++){
            numOfTimesWeveRolledEachNUm.put(key, 0);
        }
    }

    public Bins(int start, int end) {


    }

    public Integer getBin(int numToCheck) {
        return null;
    }
}
