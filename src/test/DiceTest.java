
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testDice1(){
        Dice newDice = new Dice(2);

        System.out.println(newDice.tossAndSum());

    }

    @Test
    public void testDice2(){
        Dice newDice = new Dice(1);

        System.out.println(newDice.tossAndSum());

    }

    @Test
    public void testDice3(){
        Dice newDice = new Dice(3);

        System.out.println(newDice.tossAndSum());

    }

    @Test
    public void testDice4(){
        Dice newDice = new Dice(5);

        System.out.println(newDice.tossAndSum());

    }
}