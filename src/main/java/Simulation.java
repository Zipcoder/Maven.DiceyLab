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
        diceTable = new Bins(numberOfDice, numberOfDice * 6);
        for(int i = 1; i <= numberOfRolls; i++) {

            diceTable.incrementBin(dice.tossAndSum());
        }
    }
    public void printResults(){

    }
}
/*




    }
}*/




