import java.util.Random;

public class Dice {

    private Integer[] rolls;

    public Dice(Integer numberOfDice) {
        rolls = new Integer[numberOfDice];
       }

    public Integer[] getRolls() {
        return rolls;
    }

    public Integer tossAndSum() {
        Integer[] rolls = getRolls();
        Integer sum = 0;
        for (Integer i = 0; i < rolls.length; i++) {
            rolls[i] = dieRoll();
            sum += rolls[i];
        }
        return sum;
    }

    public Integer dieRoll() {
        Random rnd = new Random();
        return rnd.nextInt(6)+1;
    }
}
