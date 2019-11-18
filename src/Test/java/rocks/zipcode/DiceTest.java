package rocks.zipcode;


import org.junit.Assert;
import org.junit.Test;



public class DiceTest {

    @Test


    public void tossAndSumTest(){
        Dice dice = new Dice(4);
        int actual = dice.diceQuantity;

        Assert.assertTrue(actual<dice.tossAndSum()-1);






    }

}
