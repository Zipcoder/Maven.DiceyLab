import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DiceTest {
    @Test
    public void diceTest(){
        //given
        Dice newDices = new Dice(10);
        //when
        Integer[] dices = newDices.getDiceList().toArray(new Integer[0]);
        //then
        System.out.println(Arrays.toString(dices));
    }

    @Test
    public void tossAndSumTest(){
        //given
        Dice newDices = new Dice(10);
        Integer[] preToss = newDices.getDiceList().toArray(new Integer[0]);
        //when
        Integer toss = newDices.tossAndSum();
        Integer[] postToss = newDices.getDiceList().toArray(new Integer[0]);
        //then
        //Check with output 
        System.out.println(Arrays.toString(preToss));
        System.out.println("================After Tossing================");
        System.out.println(Arrays.toString(postToss));
        System.out.println(toss);

    }

}
