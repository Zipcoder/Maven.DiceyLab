import java.util.Random;

public class Dice {

    Integer numberOfDice;
    Integer numberOfSides;
    Random random;

    public Dice(){
        numberOfDice = 1;
        numberOfSides = 6;
        random = new Random();
    }

    public Dice(int number){
        numberOfDice = number;
        numberOfSides = 6;
        random = new Random();
    }


    public Integer roll(Integer numberOfRolls){
        Integer sum = 0;
        for(int i = 0; i < numberOfRolls; i++){
            sum += rollOnce();
        }
        return sum;
    }

    public Integer roll(){
        return rollOnce();
    }

    public Integer getNumberOfDice(){
        return numberOfDice;
    }

    public Integer getNumberOfSides(){
        return numberOfSides;
    }



    private Integer rollOnce(){
        Integer sum = 0;
        for(int i = 0; i < numberOfDice; i++){
            sum += (random.nextInt(6) + 1);
        }
        return sum;
    }




}
