import java.util.Arrays;
import java.util.Random;

public class Dice {
    private int rollNum;

    public Dice(int rollNum) {
        this.rollNum = rollNum;
    }

    public int yeetAndSum() {
        int indexNum = 0;
        for (int i = 0; i < rollNum; i++) {
            indexNum += (int)(Math.random()* ((6 - 1)+ 1) + 1);

        }
        return indexNum;
    }
}