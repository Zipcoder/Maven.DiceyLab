import java.util.Map;

public class Simulation {


    public static void main(String[] args) {

        Dice dice = new Dice();

        for (int i = 0; i < 1000000; i++) {
            dice.rollDiceAndPersistValues();
        }

//        String results = Bins.diceRollTotalsAndFrequency.toString().replaceAll("[\\[\\](){}]", "");
        for(Map.Entry entry : Bins.diceRollTotalsAndFrequency.entrySet()){
            System.out.println(entry +"\n");
        }

    }
}

//         2 :    27917: 0.03 **
//         3 :    55422: 0.06 *****
//         4 :    83457: 0.08 ********
//         5 :   110961: 0.11 ***********
//         6 :   139098: 0.14 *************
//         7 :   166977: 0.17 ****************
//         8 :   138386: 0.14 *************
//         9 :   111102: 0.11 ***********
//         10 :    83367: 0.08 ********
//         11 :    55799: 0.06 *****
//         12 :    27514: 0.03 **


