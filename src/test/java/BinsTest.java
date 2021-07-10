import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class BinsTest {
    @Test
    public void binsTest(){
        //given
        Integer min = 2;
        Integer max = 12;
        //when
        Bins bin = new Bins(min, max);
        //then
        System.out.println(Arrays.toString(bin.getBoxes()));
    }

    @Test
    public void fillBinsTest(){
        //given
        Bins bin = new Bins(2, 12);
        Dice dice = new Dice(2);
        //when
        for (int i = 0; i < 1000000; i++) {
            Integer input = dice.tossAndSum();
            bin.fillBins(input);
        }
        String result = Arrays.toString(bin.getBoxes());
        //then -check by looking at
        System.out.println(result);
    }

    @Test
    public void getBinTest(){
        //given
        Bins bin = new Bins(2, 12);
        Dice dice = new Dice(2);
        //when
        for (int i = 0; i < 1000; i++) {
            Integer input = dice.tossAndSum();
            bin.fillBins(input);
        }
        String wholeBin = Arrays.toString(bin.getBoxes());
        Integer bin5 = bin.getBin(5);
        Integer bin12 = bin.getBin(12);
        //Then
        System.out.println(wholeBin);
        System.out.println(bin5);
        System.out.println(bin12);

    }

    @Test
    public void incrementBinTest(){
        //given
        Bins bin = new Bins(2, 12);
        Dice dice = new Dice(2);
        //when
        for (int i = 0; i < 1000; i++) {
            Integer input = dice.tossAndSum();
            bin.fillBins(input);
        }
        String wholeBin = Arrays.toString(bin.getBoxes());
        Integer bin12 = bin.getBin(12);
        bin.incrementBin(12);
        Integer bin12AfterIncrement = bin.getBin(12);

        //Then
        System.out.println(wholeBin);
        System.out.println(bin12);
        System.out.println(bin12AfterIncrement);

    }

    @Test
    public void getPercentTest(){
        //given
        Bins bin = new Bins(2, 12);
        Dice dice = new Dice(2);
        for (int i = 0; i < 1000; i++) {
            Integer input = dice.tossAndSum();
            bin.fillBins(input);
        }
        String wholeBin = Arrays.toString(bin.getBoxes());
        //when
        double result = bin.getPercent(12);
        //then
        System.out.println(wholeBin);
        System.out.println(result);
    }

}
