import com.sun.codemodel.internal.JForEach;

import java.util.ArrayList;
import java.util.HashMap;

public class Bins {
    private Integer arrayMin;
    private Integer arrayMax;
    public ArrayList<Integer> result;

    public Bins(Integer arrayMin, Integer arrayMax) {
        this.arrayMin = arrayMin;
        this.arrayMax = arrayMax;
        this.result = new ArrayList<Integer>();
        for (int i = 0; i < arrayMax; i++)
            result.add(i, 0);
    }

    public Integer getBin(Integer index) {
        return result.get(index - arrayMin);
    }

    public void incrementBin(Integer numbOfNum) {
        int index = numbOfNum - arrayMin;
        Integer value = result.get(index);
        value++;
        result.set(index, value);
    }


//    Bins results = new Bins(2, 12); // for bins from 2..12
//    Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
//    results.incrementBin(10); // should increment bin # 10


}
