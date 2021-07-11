
public class Bins {

    private int min;
    private int max;
    Integer[] sumOfRolls;

    public Bins(int min, int max){
        this.min = min;
        this.max = max;
        this.sumOfRolls = new Integer[(max - min) + 1];
        for (int i = 0; i < sumOfRolls.length; i++) {
            sumOfRolls[i] = 0;
        }
    }

    public Integer getBin(int oneSum){
        int index = oneSum-min;
        return sumOfRolls[index];
    }

    public void incrementBin(int sameSum){
        int index = sameSum-min;
        sumOfRolls[index]++;
    }
}
