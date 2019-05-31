import org.omg.PortableInterceptor.INACTIVE;

public class Bins {
    private Integer[] bins;

    public Bins(Integer startIndex, Integer endIndex) {
        bins = new Integer[(endIndex-startIndex)+1];
    }
    //how many times you get an integer
    //Bins(2, 12) creates bins from 2 to 12 and stores number of times you roll a 2 to 12

    public void incrementBin(Integer index){
        bins[index]++;
    }
}

