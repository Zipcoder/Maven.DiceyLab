
import java.util.Random;

public class Dice {

    public Dice(Integer numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSumTotal (){
        Random random = new Random();
    }
        Integer sumTotalOfToss = 0;
        for(Integer i = 0; i < numberOfDice i++){
        sumTotalOfToss += random.nextInt(6)+1;
        }
        return sumTotalOfToss;
}
