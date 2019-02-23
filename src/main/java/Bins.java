import java.util.HashMap;

public class Bins {

    HashMap<Integer, Integer> bin;
    Integer max;
    Integer min;


    public Bins(Integer min, Integer max) {
        this.min = min;
        this.max = max;
        bin = new HashMap<Integer, Integer>();
        for (int i = min; i <= max; i++) {
            bin.put(i, 0);
        }

    }

    public Integer getBin(Integer result) {


        return bin.get(result);


    }

    public void addToBin(Integer addResult) {

        if (addResult <= max && addResult >= min) {
            bin.put(addResult,getBin(addResult)+1);
        }
    }
}


