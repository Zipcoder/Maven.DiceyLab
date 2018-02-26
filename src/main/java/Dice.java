public class Dice {

    public int numberOfDice;

    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public int diceRoll () {
        int sumOfTotalRolls = 0;
        for (int i = 0; i < numberOfDice; i++) {
            sumOfTotalRolls += (int) (Math.random() * 6 + 1);
        }

        return sumOfTotalRolls;
    }
}
