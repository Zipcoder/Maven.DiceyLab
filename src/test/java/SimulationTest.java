import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SimulationTest {

    @Test
    public void getStarsTest(){
        //given
        Simulation newSim = new Simulation(2, 10);
        newSim.runSim();
        double number = .05;
        BigDecimal num = new BigDecimal(number).setScale(2, RoundingMode.HALF_DOWN);
        String result = newSim.getStars(number);
        System.out.println(result);



    }

}
