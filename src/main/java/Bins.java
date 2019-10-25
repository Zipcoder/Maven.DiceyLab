import java.util.Arrays;
import java.util.ArrayList;

public class Bins {
    ArrayList<Integer> numberBin = new ArrayList();
    public Bins(int binMin, int binMax) {
        numberBin.ensureCapacity(binMax+1);
        for(int i = 0; i<binMax; i++){
            numberBin.set(i, 0);
        }
    }

    public int getBins(int returnValue) {
        return numberBin.get(returnValue);
    }

    public void incrementBin(int incrNum){
        numberBin.set(incrNum, numberBin.get(incrNum)+1);
    }
}




