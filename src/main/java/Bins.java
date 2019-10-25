import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class Bins {


    //ArrayList<Integer> numberBin = new ArrayList();

    Integer[]numberBin;

    public Bins(int binMax) {

        //numberBin.ensureCapacity(binMax);
        numberBin = new Integer[binMax];
        for(int i = 0; i<binMax; i++){
            numberBin[i]=0;

        }
    }

    public int getBins(int returnValue) {
        return numberBin[returnValue];
    }

    public void incrementBin(int incrNum){
        numberBin[incrNum] = numberBin[incrNum]+1;
    }
}




