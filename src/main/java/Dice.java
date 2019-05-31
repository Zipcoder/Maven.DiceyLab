import java.util.Arrays;
import java.util.Random;

public class Dice {

    private Integer[] dice;

    // construct some number amount of dice with value 1
    public Dice(Integer amountOfDice){
        dice = new Integer[amountOfDice];
        Arrays.fill(dice,1);
    }

    public void toss(){
        Random randNumMaker = new Random();
        for(Integer index = 0; index < dice.length; index++)
            dice[index] = randNumMaker.nextInt(6)+1;
    }

    public Integer sum(){
        Integer sum=0;
        for(Integer die: dice)
            sum+=die;

        return sum;
    }

    public Integer tossAndSum() {
        toss();
        return sum();
    }

    public Integer[] getDice(){
        return Arrays.copyOf(dice,dice.length);
    }
}
