import java.util.Arrays;

public class Simulation {
    Bins diceTable;
    int numberOfDice, numberOfRolls;
    public Simulation(int x, int y){
        numberOfDice = x;
        numberOfRolls = y;


    }
    public void runSimulation(){
        Dice dice = new Dice(numberOfDice);
        diceTable = new Bins(numberOfDice, numberOfDice * 6 + 1);
        for(int i = 1; i <= numberOfRolls; i++) {

            diceTable.incrementBin(dice.tossAndSum());
            System.out.println(diceTable.toString());
        }
    }
    public void printResults(){
        System.out.println("*** \n" +
        "Simulation of " + numberOfDice + "dice tossed for " + 1000000 + "times.\n" +
                "***\n");
        for(int i = 1; i <= numberOfDice; i++){
            System.out.printf("%2d %s %6f %s %1.2f %s", i + " :" + diceTable.getBins(i) + ": " + diceTable.getBins(i)/1000000 +" *");

        }





    }
}
/*




    }
}*/




