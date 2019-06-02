import com.sun.deploy.uitoolkit.impl.awt.AWTWindowFactory;
import com.sun.org.apache.xpath.internal.operations.String;

public class Simulation {
    private Integer numberOfDice;
    private Integer numberOfTosses;
    private Bins bin;

    public Simulation(Integer numberOfDice, Integer numberOfTosses){
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        bin = new Bins(new Dice(numberOfDice));
    }

    public void runSimulation(){
        bin.runTrial(numberOfTosses);
    }

    public void getDisplay(){//TODO prints graphical display of normalized dist.
        StringBuilder output = new StringBuilder();
        Dice d = bin.getDice();
        for(int i = d.getQuantity(); i < d.getHighestRoll(); i++){
            output.append(bin.getRawResults()[i]);
            output.append("\n");
        }
        System.out.println(output.toString());
    }
}
