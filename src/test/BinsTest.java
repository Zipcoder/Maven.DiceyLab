import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BinsTest {

    @Before
    public void setUp() throws Exception {
   }

   @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testBin(){

        Bins newBin = new Bins(2,12);
    }

    @Test
    public void testGetBin(){
        Bins newBin = new Bins(1,12);
        System.out.println(newBin.getBin(3));

    }

    @Test
    public void testIncrementBin(){

        Bins newBin = new Bins(1,12);
        newBin.incrementBin(3);
        System.out.println(newBin.getBin(3));

    }


}