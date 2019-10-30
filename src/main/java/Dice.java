

public class Dice {

   public Integer NumOfDiceBeingRolled;
//    public Integer sum;
    public Integer dieRoll1;

//public Dice (Integer NumOfDiceBeingRolled) {
//        this.NumOfDiceBeingRolled = NumOfDiceBeingRolled;
//    }



//    public Integer getNumOfDiceBeingRolled()
//    {
//        return this.NumOfDiceBeingRolled;
//    }


        public static Integer rollDie1 (Integer numberOfDiceBeingRolled)
        {
            Integer dieRoll1 = 0;
            for (int i = 1; i <= numberOfDiceBeingRolled; i++) {
                dieRoll1 += (int) (Math.random() * 6 + 1);
            }
            return dieRoll1;
        }

//        public Integer sum(dieRoll1)
//        {
//            dieRoll1 +=
//        }


    }










//public Dice (Integer NumOfDiceBeingRolled) {
//    this.NumOfDiceBeingRolled = NumOfDiceBeingRolled;
//    }
//
//    public Integer tossNSum() {
//        int sumOfDiceRolls = 0;
//        for (int i = 0; i<NumOfDiceBeingRolled; i++) {
//            int dieRolls = (int) (Math.random() * 6 + 1);
//            sumOfDiceRolls += dieRolls;
//        }
//        return sumOfDiceRolls;
//    }
//
//    public Integer getNumOfDiceBeingRolled()
//    {
//        return this.NumOfDiceBeingRolled;
//    }
//}

