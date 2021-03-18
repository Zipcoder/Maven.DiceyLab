import org.junit.Test;

import static org.junit.Assert.*;

public class BinsTest {


    @Test
    public void getBin() {
        //given
        Bins bins = new Bins(2, 12);
        //When
        int actual =  bins.getBin(4);

        //Then
        assertEquals(0, actual);
    }


}