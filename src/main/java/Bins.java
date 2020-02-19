import java.util.HashMap;
import java.util.Map;

public class Bins {

    private Integer lowLimit;
    private Integer highLimit;
    private Map<Integer, Integer> bin;

    public Bins(Integer low, Integer high) {
        this.lowLimit = low;
        this.highLimit = high;
        this.bin = new HashMap<>();
    }

    public Integer getBin(Integer binNo) {
        return bin.get(binNo);
    }

    public void incrementBin(Integer binNo) {
        if (this.bin.containsKey(binNo)) {
            this.bin.put(binNo, this.bin.get(binNo) + 1);
        } else if (binNo >= lowLimit && binNo <= highLimit) {
            this.bin.put(binNo, 1);
        }
    }

    public Integer sumOfResults() {
        Integer sum = 0;
        for (Map.Entry<Integer, Integer> entry : bin.entrySet()) {
            sum += entry.getValue();
        }
        return sum;
    }

}
