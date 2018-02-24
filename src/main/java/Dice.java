import java.util.Random;

/* Create a Dice class that acts like a set of N random-tossed dies.
Example:
Dice dice = new Dice(2); // for craps
Dice dice = new Dice(5); // for yatzee

Integer toss = dice.tossAndSum();
make a couple unit tests for the Dice class.

*/

public class Dice {

    public int numOfDice;


    //Constructor
    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }


    //Created a for loop. Everytime we roll a die, we add the RANDOM roll value to the sum
    public Integer tossAndSum (){
        Random rand = new Random();
        Integer sumOfToss = 0;
        for (int i = 0; i < numOfDice; i++){
            sumOfToss += rand.nextInt(6)+1;
        }
        return sumOfToss;
    }

}
