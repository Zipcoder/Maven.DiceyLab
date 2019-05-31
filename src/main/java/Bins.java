
public class Bins {

    Integer minValue;
    Integer maxValue;
    Integer[] theBins;

    public Bins(Dice dice){
        minValue = dice.getNumberOfDice();
        maxValue = dice.getNumberOfDice() + dice.getNumberOfSides();
        theBins = new Integer[1 + maxValue - minValue];
    }

    public Bins(int minValue, int maxValue){
        this.minValue = minValue;
        this.maxValue = maxValue;
        theBins = new Integer[1 + maxValue - minValue];
    }

    public Integer getMinValue(){
        return minValue;
    }

    public Integer getMaxValue(){
        return maxValue;
    }

}
