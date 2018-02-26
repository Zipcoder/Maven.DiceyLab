//import java.util.ArrayList;
//

import java.util.Random;

public class Dice {
    public int numOfDice;

    //Constructor
    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    //Method
    public Integer tossAndSum (){
        Random rand = new Random();
        Integer sumOfToss = 0;
        for (int i = 0; i < numOfDice; i++){
            sumOfToss += rand.nextInt(6)+1;
        }
        return sumOfToss;
    }

}


//public class Dice  {
//    int dice1;
//    int dice2;
//    int sum = 0;
//    int numberOfDice;
//    int numberofRolls;
//
//    public Dice (int numberOfDice){
//        this.numberOfDice = numberOfDice;
//    }
//
//    public static int rollDice() {
//        int dice1 = (int) (Math.random() * 6 + 1);
//        int dice2 = (int) (Math.random() * 6 + 1);
//        int sum = dice1 + dice2;
//        return sum;
//    }
//
//    public static int rollDiceSim(int numberOfDice, int numberofRolls) {
//        int sum = 0;
//        for (int i = 0; i < numberofRolls; i++) {
//            int dice1 = (int) (Math.random() * 6 + 1);
//            int dice2 = (int) (Math.random() * 6 + 1);
//            sum = dice1 + dice2;
//
//        }
//        return sum;
//    }
//}
//    public void getResults(){}
//    public static int rollDice() {
//        return (1 + (int) (Math.random() * 6)) + (1 + (int) (Math.random() * 6));}
//   Dice dice = new Dice(2); // for craps
//    Dice dice = new Dice(5); // for yatzee
//    Integer toss = dice.tossAndSum();