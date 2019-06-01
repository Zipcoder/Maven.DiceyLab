import java.util.Arrays;

public class Bins {

    Integer minValue;
    Integer maxValue;
    Integer[] theBins;

    public Bins(Dice dice){
        minValue = dice.getNumberOfDice();
        maxValue = dice.getNumberOfDice() * dice.getNumberOfSides();
        theBins = new Integer[1 + maxValue - minValue];
        Arrays.fill(theBins, 0);

        // for testing
        // theBins[0] = 1; // first test
        // theBins[7] = 5; // second test
    }

    public Bins(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
        theBins = new Integer[1 + maxValue - minValue];
        Arrays.fill(theBins, 0);
    }

    public void incrementBin(int bin){
        theBins[bin - minValue]++;

    }

    public Integer getBinValue(int bin){
        return theBins[bin - minValue];
    }

    public Integer[] getAllBins(){
        return theBins;
    }

    public Integer getMinValue(){
        return minValue;
    }

    public Integer getMaxValue(){
        return maxValue;
    }

}
