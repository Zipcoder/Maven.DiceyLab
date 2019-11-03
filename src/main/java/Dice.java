public class Dice {

    //instance variables
    private Integer numberDice;

    Dice(Integer numberDice) {

        this.numberDice = numberDice;
    }

    public Integer tossAndSum() {


        Integer sum = 0;

        for (int i = 0; i < numberDice; i++) {
            // random method
            int random = (int) (Math.random() * 6 + 1);
            System.out.println(random);
            sum = sum + random;
            System.out.println(sum);
        }
        return sum;
    }
}