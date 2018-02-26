import java.util.TreeMap;

public class Bins {

    public TreeMap<Integer, Integer> countTotals = new TreeMap<Integer, Integer>();
    int numberOfDice;
    int numberOfKeys;

    public Bins(Dice dice) {
        this.numberOfDice = dice.getNumberOfDice();
        this.numberOfKeys = dice.getNumberOfDice() * 6;
    }

    public void createBin() {
        for(int i = 2; i <= getNumberOfKeys(); i++) {
            countTotals.put(i, 0);
        }

    }

    public void countPlacedIntoBin(Dice dice, Integer numberOfRolls){
        createBin();
        for(int i = 0; i < numberOfRolls; i++) {
            int key = dice.diceRoll();
            int value = countTotals.get(key);
            value +=1;
            countTotals.put(key, value);
        }
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
    public int getNumberOfDice() {
        return getNumberOfKeys();
    }


}
