

public class Dice {

    int numOfDie;

    public Dice () {

    }

    public int rollDice(int numOfDie) {
        Dice dice1 = new Dice();
        int sumOfRoll = 0;
        for (int roll = 1; roll <= numOfDie; roll++) {
            sumOfRoll += (int) (Math.random() * 6 + 1);
        }
        return sumOfRoll;

    }


}
