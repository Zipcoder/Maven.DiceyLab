

public class Dice {
    private Integer numberOnDice;

    public Dice(Integer numberOnDice) {
        this.numberOnDice = numberOnDice;
    }

    public int tossAndSum(){
        int sum = 0;
        for (int i = 0; i < numberOnDice; i++) {
            sum += (int) Math.random() * 6 + 1;
        }
        return sum;
    }

    public Integer getNumberOnDice() {
        return numberOnDice;
    }


}
