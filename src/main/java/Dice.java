
import java.util.Random;

public class Dice {
    int x;
    public Dice(int diceQuantity){
        x = diceQuantity;
    }

    public int tossAndSum() {
        int result = 0;
        Random random = new Random();


        for(int i = 1; i <= x; i++){
            result = result + random.nextInt(6)+1;

        }
        return result;

    }

}





