public class Dice{
    int diceNum;

    public Dice(int numOfDies){
        this.diceNum = numOfDies;
    }

    public int maxSum(){
        return diceNum * 6;
    }
    public int leastSum(){
        return diceNum;
    }

}
