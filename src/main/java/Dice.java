import java.util.Arrays;
import java.util.Random;

public class Dice {

<<<<<<< HEAD
    private int rollNum;

    public Dice(int rollNum) {
        this.rollNum = rollNum;
    }


    public int yeetAndSum() {
        int indexNum = 0;
        for (int i = 0; i < rollNum; i++) {
            indexNum += (int) (Math.random() * ((6 - 1) + 1) + 1);

        }
        return indexNum;
=======
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
>>>>>>> 62e6f817c8356d9d263be6bb39bfaea5dce7acd3
    }

}