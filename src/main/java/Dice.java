import java.util.ArrayList;
import java.util.List;

public class Dice {
    private ArrayList<Integer> diceList = new ArrayList<Integer>();

    public Dice(Integer countOfDice) {
        for (int i = 0; i < countOfDice; i++) {
            this.diceList.add((int) ((Math.random() * (6 - 1)) + 1));
        }
    }
    public ArrayList<Integer> getDiceList() {
        return diceList;
    }

    public Integer tossAndSum() {
        Integer sum = 0;
        for (int i = 0; i < diceList.size(); i++) {
            diceList.set(i, (int) ((Math.random() * (6 - 1)) + 1));
            sum += diceList.get(i);
        }
        return sum;
    }
}
