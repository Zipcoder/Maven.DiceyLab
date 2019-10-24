import java.util.Arrays;
import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        Random random = new Random();
        int[] diceCounter = new int[13];

        for(int i = 1; i <=1000000; i++){
            int diceA = random.nextInt(6)+1;
            int diceB = random.nextInt(6)+1;

            diceCounter[diceA + diceB]++;
        }

        System.out.println(Arrays.toString(diceCounter));
    }

}





