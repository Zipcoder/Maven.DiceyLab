
public class Bins {
    private int[] store;

    public Bins(Integer size) {
        this.store = new int[size];
    }

    public void tally(Integer index) {
        this.store[index] += 1;
    }

    public Integer getTally(Integer index) {
        return this.store[index];
    }
}
