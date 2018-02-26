import java.util.*;

    public class Dice {
        public static final int howManyRolls = 1000000;

        public static void main(String[] args) {
            int[] d = new int[13];
            for (int i = 2; i < 13; i++) d[i] = 0;

            for (int j = 0; j < howManyRolls; j++) {
                int die1 = (int) (6.0 * Math.random() + 1.0);
                int die2 = (int) (6.0 * Math.random() + 1.0);
                int sumOfDice = die1 + die2;
                d[sumOfDice]++;
            }
            System.out.print("Rolls: " + howManyRolls);
            for (int i = 2; i < 13; i++)
                System.out.print(", " + i + ": " + d[i]);
            System.out.println();
        }
    }