public class Dice {

    public Dice(int numDice){

    }


    public int rollDice(int numDice) {
        return (int) (Math.random()*numDice*6);
    }
}
