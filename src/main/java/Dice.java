import java.util.ArrayList;

public class Dice  {
    int dice1;
    int dice2;
    int sum = 0;
    public static int rollDice() {
        int dice1 = (int) (Math.random() * 6 + 1);
        int dice2 = (int) (Math.random() * 6 + 1);
        int sum = dice1 + dice2;
        return sum;
    }

    public static int rollDiceSim(int rolls) {
        int sum = 0;
        for (int i = 0; i < rolls; i++) {
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            sum = dice1 + dice2;
        }
        return sum;
    }
}


//    public void getResults(){}
//    public static int rollDice() {
//        return (1 + (int) (Math.random() * 6)) + (1 + (int) (Math.random() * 6));}

//   Dice dice = new Dice(2); // for craps
//    Dice dice = new Dice(5); // for yatzee
//    Integer toss = dice.tossAndSum();