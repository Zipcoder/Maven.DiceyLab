import org.junit.Assert;
import org.junit.Test;


class DiceTest {

    @Test
    public void tossAndSum() {
        //given
        Dice dice = new Dice(2);
        //When
        int actual = dice.tossAndSum();
        //then

        Assert.assertTrue(actual < 12 && actual > 2);

    }



}