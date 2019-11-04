import java.util.Map;
import java.util.HashMap;



public class Bins {
    private int dieNum;
    private int yeetNum;
    public Bins(int dieNum,
                int yeetNum){
        this.dieNum = dieNum;
    this.yeetNum = yeetNum;
    }
    public double[] ammountOfRolls(){
        Dice die = new Dice(dieNum);
        double[] occurance = new double[dieNum * 6];
        for(int i = 0; i < yeetNum; i++)
            occurance[die.yeetAndSum() - 1] += 1;
        return occurance;
    }
    public void occurancePrint(){ double[] result = ammountOfRolls();
        for(int i = dieNum - 1; i < result.length; i++){
            System.out.printf("%4d %s %7.0f %s %1.2f %s", i + 1, " : ", result[i], " : ", result[i]/yeetNum, " ");
            for(int j = 0; j < (result[i]/yeetNum)* 100; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
