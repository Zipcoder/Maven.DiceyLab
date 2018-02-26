public class Simulation {

    public static void main(String[] args){

        Dice dice = new Dice();

        for(int i = 0; i < 10; i ++){
            dice.rollDiceAndPersistValues();
        }
    }


}
