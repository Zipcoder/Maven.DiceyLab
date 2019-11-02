public class Dice {


    public Dice() {
    }


    public Integer rollDie(Integer numOfDice) {

        Integer result = 0;

        for (int i = 0; i < numOfDice; i++) {

            result += (int) (1 + (Math.random() * 6));

        }
        return result;
    }
    public int roll() {
        Integer sum = 0;
        for(int i = 0; i < numOfDice; i++) {
            Integer die = (int) (Math.random() * 6) + 1;
            sum += die;
        }
        return sum;
    }
}