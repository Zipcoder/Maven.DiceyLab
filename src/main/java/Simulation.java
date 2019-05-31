import javax.sound.midi.Soundbank;

public class Simulation {
//    Integer totalStars = 94;
    private Bins bins;
    private Dice dice;
    private Integer numThrows;

    public Simulation(Integer numDice, Integer numThrows) {
        this.bins = new Bins(numDice,6*numDice);
        this.dice = new Dice(numDice);
        this.numThrows=numThrows;
    }

    public void runSim(){
        for(int i=0;i<this.numThrows;i++){
            int thisToss=0;
            thisToss = this.dice.toss();
            this.bins.incrementBin(thisToss);
        }
    }

    public void printResult(){
        System.out.println("***");
        System.out.println("Simulation of "+dice.numDice+" dice tossed for "+numThrows+" times.");
        System.out.println("***\n");
        for(int i=dice.numDice;i<=6*dice.numDice;i++){
            Integer thisCount = bins.getBin(i);
            Double thisPcent = (double)thisCount/(double)numThrows;
            Integer thisStars = (int)(thisPcent*100);
            StringBuilder builder=new StringBuilder("");
            for(int j=0;j<thisStars;j++)builder.append("*");
            System.out.println(String.format("%2d:%9d: %1.2f ",i,thisCount,thisPcent)+builder.toString());
        }
    }
}
