import java.util.ArrayList;
import java.util.List;

public class Dice {

    private ArrayList<Integer> rollingResults;
    private Integer numOfDice = 2;
    private Integer sumOfDice;

    public Dice (Integer countOfDice) {
        this.rollingResults = new ArrayList<>();
        for (int i = 0; i < countOfDice; i++) {
            this.rollingResults.add((int) ((Math.random() * (7 - 1)) + 1));
        }
    }

    public ArrayList<Integer> getRollingResults() {
        return rollingResults;
    }

    public void setRollingResults(ArrayList<Integer> rollingResults) {
        this.rollingResults = rollingResults;
    }

    public Integer tossAndSum () {
        Integer sum = 0;
        for (int i = 0; i < rollingResults.size(); i++) {
            rollingResults.set(i, (int) ((Math.random() * (7 - 1)) + 1));
            sum += rollingResults.get(i);
        }
        return sum;
    }

//    public void initializeDiceList () {
//        Integer numOfDice = getNumOfDice();
//        List<Integer> rollingResults = this.getRollingResults();
//        for (int i = 0; i < numOfDice; i++) {
//            rollingResults.add(0);
//        }


    public Integer getNumOfDice() {
        return numOfDice;
    }

    public void setNumOfDice(Integer numOfDice) {
        this.numOfDice = numOfDice;
    }

    public Integer getSumOfDice() {
        return sumOfDice;
    }

    public void setSumOfDice(Integer sumOfDice) {
        this.sumOfDice = sumOfDice;
    }
}
