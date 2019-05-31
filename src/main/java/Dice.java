import com.sun.tools.corba.se.idl.InterfaceGen;
import org.omg.CORBA.INTERNAL;

import java.net.Inet4Address;

import java.util.Random;

public class Dice {

    Integer[] rolls;
    Bins bin;

    public Dice(Integer numberOfDice) {
        rolls = new Integer[numberOfDice];
        bin = new Bins(numberOfDice, 6*numberOfDice);
    }

    public Integer[] getRolls() {
        return rolls;
    }

    public Integer tossAndSum(){
        Integer[] rolls = getRolls();
        Integer sum = 0;
        for (Integer i = 0; i < rolls.length; i++) {
            rolls[i] = toss();
            sum += rolls[i];
        }
        return sum;
    }

    private Integer toss() {
        Random rnd = new Random();
        return rnd.nextInt(7)+1;
    }
}
