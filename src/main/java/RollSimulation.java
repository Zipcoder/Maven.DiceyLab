import javax.print.attribute.standard.PrintQuality;



public class RollSimulation {

//    public RollSimulation(Integer numberOfDiceBeingRolled, Integer numberOfThrows)
//    {
//        this.numberOfDiceBeingRolled = numberOfDiceBeingRolled;
//        this.numberOfThrows=numberOfThrows;
//    }


    //Integer[] counter = new Integer[13];

    public static Bins runSimulation(Integer numberOfThrows, Integer numberOfDiceBeingRolled) {
        Bins bin = new Bins(numberOfDiceBeingRolled);
        int sumResult = 0;

            for (int j = 1; j <= numberOfThrows; j++) {
                sumResult = Dice.rollDie1(numberOfDiceBeingRolled);
                bin.incrementBin(sumResult);
            }
        return bin;
        }

    }


