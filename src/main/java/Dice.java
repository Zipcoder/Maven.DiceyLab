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
//    public static Random rollDice = new Random();
//
//    public static void main(String[] args) {
//
//        final int RollCount = 1000000;
//        final int Sides = 6;
//        int counter, firstDie, secondDie;
//
//        //an array with elements to keep count
//        int[] doubleCounts = new int[Sides];
//
//        /** Set counter to begin counting from 1 and run until the final roll count is reached
//         * Two different dice(s) are rolled, and each value is stored in firstDie and secondDie
//         */
//        for (counter = 1; counter <= RollCount; counter++) {
//            firstDie = roll(Sides);
//            secondDie = roll(Sides);
//
//            if (firstDie==secondDie) {
//                doubleCounts[firstDie-1]++;
//            }
//        }
//        HashMap<Integer, Integer> map = new HashMap();
//    }
//
//    private static int roll(int sides) {
//        return rollDice.nextInt(sides) + 1;
//    }

