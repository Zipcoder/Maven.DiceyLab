import java.util.ArrayList;
import java.util.List;

public class Dice {
    Integer numberOfRolls;
    Integer numberOfDice;
    List<Integer> diceContainerForCraps = new ArrayList<Integer>();

    public Dice (Integer numberOfDice, Integer numberOfRolls) {
        this.numberOfRolls = numberOfRolls;
        this.numberOfDice = numberOfDice;
    }
    public Dice () {
    }

    public List<Integer> tossAndSumForCraps (Integer numberOfDice, Integer numberOfRolls) {
        Integer result = 0;
        List<Integer> diceContainer = this.getDiceContainerForCraps();
        for (int i = 0; i < numberOfRolls; i++) {
            Integer dice1 = (int) (Math.random() * (7 - 1) + 1);
            Integer dice2 = (int) (Math.random() * (7 - 1) + 1);
            result = dice1 + dice2;
            diceContainer.add(i, result);
        }
      //  diceContainer.addAll(diceContainerForCraps);
        setDiceContainerForCraps(diceContainer);
        return diceContainerForCraps;
    }

    public Integer getNumberOfRolls() {
        return this.numberOfRolls;
    }

    public Integer getNumberOfDice() {
        return this.numberOfRolls;
    }

    public List<Integer> getDiceContainerForCraps() {
        return diceContainerForCraps;
    }

    public void setDiceContainerForCraps(List<Integer> diceContainerForCraps) {
        this.diceContainerForCraps = diceContainerForCraps;
    }
}
