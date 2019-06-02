import com.sun.deploy.uitoolkit.impl.awt.AWTWindowFactory;

import java.util.Arrays;

public class Simulation {
    public static void main(String[] args) {
        Bins bin = new Bins(new Dice(3));
        for(int i = 0; i < 20; i++){
            bin.runTrial(100);
            System.out.println(Arrays.toString(bin.getRawResults()));
            System.out.println(Arrays.toString(bin.getResults()));
        }
    }
}
