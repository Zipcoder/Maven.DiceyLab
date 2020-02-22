import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import com.sun.tools.javac.code.Attribute;
import sun.tools.jconsole.inspector.XNodeInfo;

import java.util.Random;

public class Dice {
    private Integer roll;
    private Random random;

    public Dice(Integer roll) {
        this.roll = roll;
        this.random = new Random();
    }

    private Integer toss() {
        return ((random.nextInt(6) + 1));
    }

    public Integer tossAndSum() {
        int sum = 0;
        for (int i = 1; i <= roll; i++) {
            sum += toss();

        }
        return sum;
    }
}





