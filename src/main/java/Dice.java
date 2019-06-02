import java.util.Random;

public class Dice {

    public Integer rollDiceAndGiveValue(){
        Random random = new Random();
        int tossAndSum = random.nextInt(6) + random.nextInt(6) + 2;
        return tossAndSum;
    }

    public void persistDiceRoll(int tossAndSum){
        Bins.persistDiceRoll(tossAndSum);
    }

    public void rollDiceAndPersistValues(){
        persistDiceRoll(rollDiceAndGiveValue());
    }

}
