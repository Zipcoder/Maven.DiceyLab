import java.util.Map;
import java.util.HashMap;



public class Bins {
<<<<<<< HEAD
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
=======

    private int max;
    private int min;
    private Map<Integer, Integer> bin;

    public Bins(int max, int min) {
        this.max = max;
        this.min = min;
        bin = new TreeMap<>();
        createBin();
    }

    public Map<Integer, Integer> getBin() {
        return bin;
    }

    public void increment(int binNum) {
        int value = bin.get(binNum);
        value++;
        bin.put(binNum, value);

    }

    public void createBin() {
        for (int i = min; i <= max; i++) {
            bin.put(i, 0);
        }

    }

    public static void main(String[] args) {
        Bins b = new Bins(12,2);
        for (Map.Entry<Integer, Integer> entry : b.getBin().entrySet()) {
            System.out.println("Key: " + entry.getKey() + "       Value : " + entry.getValue());
        }
        b.increment(3);

        for (Map.Entry<Integer, Integer> entry : b.getBin().entrySet()) {
            System.out.println("Key: " + entry.getKey() + "       Value : " + entry.getValue());
>>>>>>> 62e6f817c8356d9d263be6bb39bfaea5dce7acd3
        }
    }

}
