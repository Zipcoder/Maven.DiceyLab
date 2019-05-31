import java.util.ArrayList;
import java.util.List;

public class Bins {

   private Integer[] bins;
   private Integer min;
   private Integer max;

    public Bins(Integer min, Integer max) {
        this.min = min;
        this.max = max;
        bins = new Integer[max+1];
        for(Integer index = min; index <= max; index++)
            bins[index] = 0;
    }

    public Integer getBin(Integer index) {
        return bins[index];
    }
    public void incrementBin(Integer index) {
        bins[index]++;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getMax() {
        return max;
    }
}
