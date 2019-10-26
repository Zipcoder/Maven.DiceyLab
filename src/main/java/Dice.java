public class Dice {

    Integer numberOfDice;

    public Dice(Integer numberofDice){

        this.numberOfDice = numberofDice;
    }

    public int tossAndSum(){

        Integer sumOfDice = 0;
        Integer dieTossed;

        for(int x = 0; x < numberOfDice; x++){

            dieTossed = (int) (Math.random() * 6) + 1;

            sumOfDice = sumOfDice + dieTossed;
        }

        return sumOfDice;
    }
}