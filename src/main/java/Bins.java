import java.util.Arrays;

public class Bins {

    static Integer[] values;
    private final Integer min;
    private final Integer max;

    public Bins (Integer min, Integer max) {
        this.min = min;
        this.max = max;
        this.values = new Integer[(max - min) + 1];
     //   Arrays.fill(values, 0);
        for (int i = 0; i < values.length; i++) {
            values[i] = 0;
        }
    }

    public void incrementBin(int binIndex) {
        int index = binIndex - min;
        values[index]++;
    }
}
