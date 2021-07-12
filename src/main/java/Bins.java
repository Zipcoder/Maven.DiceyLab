import java.util.Arrays;

public class Bins {

    private int min;
    private int max;
    Integer[] sumOfRolls ;

    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
        this.sumOfRolls = new Integer[(max - min) + 1];

        Arrays.fill(sumOfRolls, 0);
    }
//        for (int i = 0; i < sumOfRolls.length; i++) {
//            sumOfRolls[i] = 0;
//        }


    public Integer getBin(int sum) { // getting the sum of rolls for the specific number you're tracking
        int indexOfSum = sum - min;
        return sumOfRolls[indexOfSum];
    }

    public void incrementBin(int binIndex){
        int index = binIndex - min;
        sumOfRolls[index]++;
    }


}
