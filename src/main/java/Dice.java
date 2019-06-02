import java.util.Random;

public class Dice {
    public Integer numberOfDice;
    public Integer dice;

    //constructor, to refer to the #ofD has to use this.
    public Dice(Integer numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Integer sumOfToss(){
        Random random = new Random();

        Integer sumOfRoll = 0;
        for(Integer i =0; i<numberOfDice; i++){
            sumOfRoll += random.nextInt(6)+1;

        }

        return sumOfRoll;
    }


}
