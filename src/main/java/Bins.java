import java.util.Map;
import java.util.HashMap;



public class Bins {

    private Integer start;
    private Integer end;

    private Integer[] results;

    public Bins(Integer start, Integer end) {
        this.start = start;
        this.end = end;

        Integer endIdx = end + 1;
        results = new Integer[endIdx];

        for (int i = start - 2; i < results.length; i++) {
            results[i] = 0;
        }
    }
    public Integer getBin(Integer countOfNum) {
        return results[countOfNum];
    }

    public void incrementBin(Integer binIdx) {
        results[binIdx]++;
    }
}
