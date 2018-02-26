
import java.util.Random;

public class Dice {
//declare variables
    public int diceCount;
    public int tossMax;
    public int tossMin;
//declare number of dice
    public Dice() {
        this(1);
    }
//get number of dice used
    public Dice(int numOfDice) {
        this.diceCount = numOfDice;
        this.tossMax = this.diceCount * 6;
        this.tossMin = this.diceCount;
    }
//getters for maximum and minimum number of tosses
    public int getTossMax() {
        return tossMax;
    }

    public int getTossMin() {
        return tossMin;
    }

    public int sumOfToss() {
        int sum = 0;
        for (int i = 0; i < diceCount; i++) {
            sum += (int)(Math.random() * 6) + 1;
        }
        return sum;
    }

    public static void main(String[] args) {
//instance of number of dice used for each game
        Dice game1 = new Dice(2);
        Dice game2 = new Dice(5);
        Integer tossForGame1 = game1.sumOfToss();
        Integer tossForGame2 = game2.sumOfToss();
        System.out.println(tossForGame1);
        System.out.println(tossForGame2);
    }
}