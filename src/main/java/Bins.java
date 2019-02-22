import java.util.HashMap;

public class Bins {

    HashMap<Integer, Integer> bin;
    Integer max;
    Integer min;


    public Bins(Integer first, Integer last) {
        this.min = first;
        this.max = last;
        bin = new HashMap<Integer, Integer>();
        for (int i = first; i <= last; i++) {
            bin.put(i, 0);


        }
//        System.out.println(bin);
    }

    public Integer getBin(Integer result) {

// This is wrong because you are not supposed to roll dice in the bins, just store and retrieve values
//        for (int i: bin.keySet()) {
//            if(bin.containsKey(dice.tossAndSum())){
//            bin.put(dice.tossAndSum(),1 + bin.get(dice.tossAndSum()));
//        }
//            bin.put(dice.tossAndSum(),1);
        //go into the hashmap and find the value of key `result`

//        if(bin.get(result)==null){
//            return -1;
//        }

        return bin.get(result);

    }

    public void addToBin(Integer addResult) {
        // if the result is between min and max
        // add 1 to the result's hashmap value
        // else do nothing

//        for(Integer r : bin.keySet()){
        if (addResult <= max && addResult >= min) {
            bin.put(addResult,getBin(addResult)+1);
            System.out.println(bin);
        }

    }
}


