package Package;
import java.util.HashMap;
import java.util.Map;

public class Bins {
    HashMap<Integer,Integer> bin = new HashMap<Integer, Integer>();
//    public Integer numOfTwo;
//    public Integer numOfThree;
//    public Integer numOfFour;
//    public Integer numOfFive;
//    public Integer numOfSix;
//    public Integer numOfSeven;
//    public Integer numOfEight;
//    public Integer numOfNine;
//    public Integer numOf10;
//    public Integer numOf11;
//    public Integer numOf12;


    public Bins(int min, int max){
        this.min = min;
        this.max = max;
        for(int i =min; i <= max; i++){
            bin.put(i,0);
        }
    }


}
