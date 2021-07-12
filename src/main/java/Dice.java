public class Dice {

    private final int numberOfDice;

    public Dice(int diceNum) {
        this.numberOfDice = diceNum;
    }

    public int tossAndSum(){
        int sum = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sum += (int) ((Math.random() * 6) + 1);
        }
        return sum;
    }

}


