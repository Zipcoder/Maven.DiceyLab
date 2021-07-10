import java.util.ArrayList;

public class Dice {
    private ArrayList<Integer> rollResults;

    public Dice(Integer countOfDice) {
        this.rollResults = new ArrayList<>();
        for (int i = 0; i < countOfDice; i++) {
            this.rollResults.add((int) ((Math.random() * (7 - 1)) + 1));
        }
    }

    public ArrayList<Integer> getDiceList() {
        return rollResults;
    }

    public void toss(){
        for (int i = 0; i < rollResults.size(); i++) {
            rollResults.set(i, (int) ((Math.random() * (7 - 1)) + 1));
        }
    }

    public Integer tossAndSum() {
        Integer sum = 0;
        for (int i = 0; i < rollResults.size(); i++) {
            rollResults.set(i, (int) ((Math.random() * (7 - 1)) + 1));
            sum += rollResults.get(i);
        }
        return sum;
    }
}
