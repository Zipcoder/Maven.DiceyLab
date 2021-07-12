import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.PrintStream;
import java.util.Arrays;

public class Simulation {
    public static void main(String[] args) {
        run(2, 1000000);
    }

    private Dice dice;
    private Bins bin;
    private Integer numOfToss;
    private Integer numOfDice;
    private Integer min;
    private Integer max;

    public Simulation(Integer numOfDice, Integer numOfToss) {
        this.numOfToss = numOfToss;
        this.numOfDice = numOfDice;
        this.min = numOfDice;
        this.dice = new Dice(numOfDice);
        this.bin = new Bins(numOfDice, numOfDice * 6);
    }

    public static void run (Integer numOfDice, Integer numOfToss) {
        Dice dice = new Dice(numOfDice);
        Bins bin = new Bins(numOfDice, numOfDice * 6);

        for (int i = 0; i < numOfToss; i++) {
            dice.tossAndSum();
            bin.incrementBin(dice.tossAndSum());
        }
//        System.out.println(Arrays.toString(Bins.values));
//        System.out.println("2's:  " + Bins.values[0] + "  : %.2d");
        printer();
    }

    public static void printer () {
        String jawner = "";
        String jawnski = "";
        for (int i = 0; i < Bins.values.length; i++) {
           if (i < 3) {
               jawnski = " ";
           } else {
               jawnski = "";
           }
            Double result = Bins.values[i] / 1000000.0;
            jawner += (i + 2) + ":  " + Bins.values[i] + jawnski + "   :  " + String.format("%.2f", result) + " ";
            for (int j = 0; j < (result * 100) - 1; j++) {
               jawner += "*";
            }
        jawner += "\n";
        }
        System.out.println(jawner);
    }
}