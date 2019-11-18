package rocks.zipcode;

import java.util.Random;

public class Dice {
    public int diceQuantity;

    public Dice(int diceQuantity) {
        this.diceQuantity = diceQuantity;
    }

    public int tossAndSum() {
        int result = 0;
        Random random = new Random();

        for(int i = 1; i <= diceQuantity; i++){
            result = result + random.nextInt(6)+1;

        }
        return result;

    }

}





