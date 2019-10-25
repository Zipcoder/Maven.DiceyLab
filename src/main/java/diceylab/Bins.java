package diceylab;

import java.util.ArrayList;

public class Bins {
    private int min;
    private int max;

//    private ArrayList<Integer> rollCountArray = new ArrayList();
    private Integer[] rollCount;// = new Integer[max];

    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
//        this.rollCountArray = new ArrayList<Integer>(max);
//        this.rollCount = new Integer[max];
    }
    public Integer incrementBin(int bin) {

        int count = rollCount[bin] + 1;
        rollCount[bin] = count;
        return count;
    }
    public Integer getBin(int value) {
        return rollCount[value];
    }
    public void initBins(int max) {
        rollCount = new Integer[max];
    }
}
