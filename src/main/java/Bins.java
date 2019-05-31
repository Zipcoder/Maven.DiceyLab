import org.omg.PortableInterceptor.INACTIVE;

import javax.xml.bind.SchemaOutputResolver;

public class Bins {

    private Integer[] sums;

    public Bins(Integer startIndex, Integer endIndex) {
        sums = newBin(startIndex, endIndex);
    }
    /*
    how many times you get an integer
    Bins(2, 12) creates bins from 2 to 12 and stores number of times you roll a 2 to 12
    */

    public void incrementBin(Integer index){
        sums[index]++;
    }

    public Integer[] newBin(Integer startIndex, Integer endIndex) {
        Integer[] bin = new Integer[endIndex+1];
        for (Integer i = 0; i <= endIndex; i++) {
            bin[i] = 0;
        }
        return bin;
    }

    public Integer[] getSums() {
        return sums;
    }
}

