
public class Bins {
    Integer[] someBins;

    public Bins(Integer low, Integer high) {
        this.someBins = new Integer[high+1];
        for(int i=low;i<high+1;i++)someBins[i]=0;
    }

    public Integer getBin(Integer bin) {
        return this.someBins[bin];
    }

    public void incrementBin(Integer bin) {
        this.someBins[bin]++;
    }
}
