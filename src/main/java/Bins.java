
public class Bins {

    private Integer[] bins;
    public Bins(Integer start, Integer end){
        this.bins = new Integer[end+1];
        for (int i = 0; i < this.bins.length; i++) {
            this.bins[i] = 0;
        }
    }

    public void incrementBin(Integer roll){
        this.bins[roll]++;
    }

    public Integer getBin(Integer binNumber){
        return this.bins[binNumber];
    }

    public Integer getTotal(){
        Integer sum = 0;
        for(Integer i : this.bins){
            sum += i;
        }
        return sum;
    }
}
