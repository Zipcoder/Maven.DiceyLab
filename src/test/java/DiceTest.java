import org.junit.Assert;

import static org.junit.Assert.*;

public class DiceTest {

    @org.junit.Test


    public void defaultConstructor(){
        Dice dice = new Dice();
        Integer expected = 1;

        Integer actual = dice.getNumberOfDice();

        Assert.assertEquals(expected, actual);

    }

    public void rollTest1() {
        Integer numDice = 2;
        Dice theDice = new Dice(numDice);
        Boolean validRoll = true;

        //for(int i = 0; )

    }
}