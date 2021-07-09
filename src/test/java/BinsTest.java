import org.junit.Test;

import java.util.List;

public class BinsTest {

    @Test
    public void generatingBinsTest () {
        Dice dice = new Dice();
        Bins bins = new Bins();

        bins.allocatingValues();

        System.out.println(bins.bin2 + "\n" + bins.bin3 + "\n" + bins.bin4 + "\n" + bins.bin5 + "\n" +
                bins.bin6 + "\n" + bins.bin7 + "\n" + bins.bin8 + "\n" + bins.bin9 + "\n" + bins.bin10 + "\n" +
                bins.bin11 + "\n" + bins.bin12);
    }

}
