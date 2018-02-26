import java.util.Map;
import java.util.TreeMap;

public class Bins {

   static  Map<Integer, Integer> diceRollTotalsAndFrequency = new TreeMap<Integer, Integer>();

   public static void persistDiceRoll(Integer diceRollValue){

       Integer currentValue = diceRollTotalsAndFrequency.get(diceRollValue);
       if(currentValue == null){
           currentValue = 1;
       }
       else {
           currentValue++;
       }
       diceRollTotalsAndFrequency.put(diceRollValue, currentValue);

       //diceRollTotalsAndFrequency.put(diceRollValue,
       // diceRollTotalsAndFrequency.get(diceRollValue) == null ?
       // 1 : diceRollTotalsAndFrequency.get(diceRollValue) + 1);

   }



}
