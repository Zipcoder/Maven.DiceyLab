import java.util.Map;
import java.util.HashMap;



public class Bins {

    private int max;
    private int min;
    private Map<Integer, Integer> bin;

    public Bins(int max, int min) {
        this.max = max;
        this.min = min;
        bin = new TreeMap<>();
        createBin();
    }

    public Map<Integer, Integer> getBin() {
        return bin;
    }

    public void increment(int binNum) {
        int value = bin.get(binNum);
        value++;
        bin.put(binNum, value);

    }

    public void createBin() {
        for (int i = min; i <= max; i++) {
            bin.put(i, 0);
        }

    }

    public static void main(String[] args) {
        Bins b = new Bins(12,2);
        for (Map.Entry<Integer, Integer> entry : b.getBin().entrySet()) {
            System.out.println("Key: " + entry.getKey() + "       Value : " + entry.getValue());
        }
        b.increment(3);

        for (Map.Entry<Integer, Integer> entry : b.getBin().entrySet()) {
            System.out.println("Key: " + entry.getKey() + "       Value : " + entry.getValue());
        }
    }

}
