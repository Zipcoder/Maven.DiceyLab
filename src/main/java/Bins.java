import java.util.ArrayList;
import java.util.List;

public class Bins {
        Dice dice = new Dice();
    //    List<Integer> savedDataOnRoll = new ArrayList<Integer>(dice.diceContainerForCraps);
        Integer bin2 = 0;
        Integer bin3 = 0;
        Integer bin4 = 0;
        Integer bin5 = 0;
        Integer bin6 = 0;
        Integer bin7 = 0;
        Integer bin8 = 0;
        Integer bin9 = 0;
        Integer bin10 = 0;
        Integer bin11 = 0;
        Integer bin12 = 0;
    public void allocatingValues () {
        dice.numberOfRolls = 1000000;
        List<Integer> theList = dice.tossAndSumForCraps(2, dice.numberOfRolls);
        for (int i = 0; i < theList.size(); i++) {
            if (theList.get(i).equals(2)) {
                bin2++;
            } else if (theList.get(i).equals(3)) {
                bin3++;
            } else if (theList.get(i).equals(4)) {
                bin4++;
            } else if (theList.get(i).equals(5)) {
                bin5++;
            } else if (theList.get(i).equals(6)) {
                bin6++;
            } else if (theList.get(i).equals(7)) {
                bin7++;
            } else if (theList.get(i).equals(8)) {
                bin8++;
            } else if (theList.get(i).equals(9)) {
                bin9++;
            } else if (theList.get(i).equals(10)) {
                bin10++;
            } else if (theList.get(i).equals(11)) {
                bin11++;
            } else {
                bin12++;
            }
        }
    }
}
