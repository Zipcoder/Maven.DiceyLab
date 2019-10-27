package Package;

public class Dice {
    public int numberOfRolls;
    public int numberOfDice;
    public int min = 2;
    public int max = 12;
    public int total;
    public Dice (int numberOfRolls){
        this.numberOfRolls = numberOfRolls;
    }

    public Integer tossAndSum(){
        total+= ((int)(Math.random() * max) +min) *numberOfDice;
        return total;
    }
}
