
public class Bins {

    private int startBound;
    private int endBound;

    private int[] sumOfDiceRolls;

    /*This sets array of all possible sums
    with the exception of 0 and 1*/

    public Bins()
    {

    }

    public Bins(int startBound, int endBound)
    {
        sumOfDiceRolls = new int[endBound + 1];
    }

    //This returns the index value of the sum of the Dies
    public int getBin(int valueOfDiceRoll)
    {
        return sumOfDiceRolls[valueOfDiceRoll];
    }

    //This increments the Bin result by 1 each time it occurs
    public void incrementBin(int valueOfDiceRoll)
    {
        sumOfDiceRolls[valueOfDiceRoll] = sumOfDiceRolls[valueOfDiceRoll] + 1;
    }

}
