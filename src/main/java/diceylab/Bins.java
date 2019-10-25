package diceylab;

public class Bins {
    private int numberOfDice;
    private int max;
    private Integer[] rollCount;

    public Bins(int numberOfDice) {
        this.numberOfDice = numberOfDice;
        this.max = numberOfDice*6;
        this.rollCount = new Integer[max+1];
        for (int i = numberOfDice; i <= max; i++) {
            if (this.rollCount[i] == null) {
                this.rollCount[i] = 0;
            }
        }
    }

    public Integer incrementBin(int bin) {
        int count = 0;
        if (rollCount[bin] != null) {
            count = rollCount[bin] + 1;
            rollCount[bin] = count;
        }
        return count;
    }
    public Integer getBin(int value) {
        return rollCount[value];
    }

    public Integer[] getBinsArray() {
        return rollCount;
    }
}
