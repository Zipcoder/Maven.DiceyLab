package Package;
import java.util.HashMap;
import java.util.Map;

public class Bins {
    HashMap<Integer,Integer> bin = new HashMap<Integer, Integer>();
//    public Integer numOfTwo = bin.get(2);
//    public Integer numOfThree = bin.get(3);
//    public Integer numOfFour = bin.get(4);
//    public Integer numOfFive = bin.get(5);
//    public Integer numOfSix = bin.get(6);
//    public Integer numOfSeven = bin.get(7);
//    public Integer numOfEight = bin.get(8);
//    public Integer numOfNine = bin.get(9);
//    public Integer numOf10 = bin.get(10);
//    public Integer numOf11 = bin.get(11);
//    public Integer numOf12 = bin.get(12);
    public int min;
    public int max;

    public Bins(int min, int max){
        this.min = 2;
        this.max = 12;
        for(int i =min; i <= max; i++){
            bin.put(i,0);
        }
    }
    public void incrementBin(Integer key){
        bin.put(key, bin.get(key) +1);
    }

    public Integer getBin(Integer key){
        return bin.get(key);
    }




}
