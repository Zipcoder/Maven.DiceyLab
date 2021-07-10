import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Bins {

    private Integer[] boxes;
    private final Integer min;
    private final Integer max;


    public Bins(Integer min, Integer max){
        this.min = min;
        this.max = max;
        this.boxes = new Integer[(max - min) + 1];
        Arrays.fill(boxes, 0);
    }
    public Integer[] getBoxes() {
        return boxes;
    }

    public void fillBins(Integer number){
        int index = number - min;
        boxes[index]++;
    }

    public Integer getBin(int binIndex) {
        return boxes[binIndex - min];
    }

    public void incrementBin(int binIndex) {
        boxes[binIndex - min]++;
    }

    public double getPercent(Integer boxOfResult){
        Integer sum = 0;
        for(Integer number: boxes){
            sum += number;
        }
        double raw = (double) this.getBin(boxOfResult)/sum;
        BigDecimal rounded = new BigDecimal(raw).setScale(2, RoundingMode.HALF_EVEN);
        double result = rounded.doubleValue();
        return result;
    }
}
