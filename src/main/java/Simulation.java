import com.sun.deploy.uitoolkit.impl.awt.AWTWindowFactory;

public class Simulation {
    private Integer numberOfDice;
    private Integer numberOfTosses;
    private Bins bin;

    public Simulation(Integer numberOfDice, Integer numberOfTosses){
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        bin = new Bins(new Dice(numberOfDice));
    }
    public static void main(String[] args) {

    }

    public void runSimulation(){
        bin.runTrial(numberOfTosses);
    }

    public void getDisplay(){//TODO prints graphical display of normalized dist.

    }
}
