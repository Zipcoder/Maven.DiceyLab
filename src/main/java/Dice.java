import java.util.concurrent.ThreadLocalRandom;

public class Dice {

    private Integer numOfDice;
    private Integer sumOfDice;
    public Dice(Integer numberOfDice){
        this.numOfDice = numberOfDice;
        this.sumOfDice = 0;
    }

    public Integer getNumOfDice(){
        return this.numOfDice;
    }

    public Integer tossAndSum(){
        this.sumOfDice = 0;
        for (int i = 0; i < this.numOfDice; i++) {
            this.sumOfDice += ThreadLocalRandom.current().nextInt(1, 7);
        }
        return this.sumOfDice;
    }

}
