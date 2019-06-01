import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Simulation {

    private int numberOfReps;
    private Dice dice;
    private Bins bins;

    public Simulation(int numberOfDice, int numberOfReps){
        this.numberOfReps = numberOfReps;
        dice = new Dice(numberOfDice);
        bins = new Bins(dice);
    }

    public void runSim(){
        for(int i = 0; i < numberOfReps; i++){
            bins.incrementBin(dice.roll());
        }
    }

    public String printSim(){
        // String format should be more flexible
        StringBuilder sbuild = new StringBuilder();
        for(int i = bins.getMinValue(); i <= bins.getMaxValue(); i++){
            sbuild.append(String.format("%2d:%8d:%5.2f %s\n",i,bins.getBinValue(i),
                    (bins.getBinValue(i)*1.0)/(numberOfReps*1.0),getStars(i)));
        }
        return sbuild.toString();
    }

    public void printSimToFile(String fileName) throws IOException {
        File printFile = new File(fileName);
        if(!printFile.exists()){
            printFile.createNewFile();
        }
        PrintWriter fout;
        fout = new PrintWriter(printFile);
        //fout.printf("")
        fout.write(printSim());
        fout.flush();
        fout.close();
    }

    public String getStars(int binNumber){
        StringBuilder sbuild = new StringBuilder();
        //int value = bins.getBinValue(binNumber);

        for(int i = 0; i < bins.getBinValue(binNumber)/10000; i++){
            sbuild.append('*');
        }

        return sbuild.toString();
    }




}
