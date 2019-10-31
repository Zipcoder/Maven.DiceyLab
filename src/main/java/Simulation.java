public class Simulation
{

    private Integer numberOfDice;

    private Integer numberOfTosses;
    private Dice dice;
    private Bins bins;

    public Simulation(Integer numberOfDice, Integer numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDice);
        this.bins = new Bins(numberOfDice);
    }

    public void runSimulation () {

        int tossValue = 0;
        for (Integer i = 0; i < numberOfTosses; i++) {
            tossValue = this.dice.tossAndSum();
            this.bins.incrementBin(tossValue);
        }

    }

    public void printResults() {


        //int binSize = this.bins.;
        int numberOfBins = this.numberOfDice*6;
        Integer binValue = 0;
        float percentofToss = 0;
        Integer numberOfStars = 0;
        StringBuffer sb ;

        System.out.println("***\n");
        System.out.println("Simulation of " + this.numberOfDice + " dice tossed for "+ this.numberOfTosses +" times.\n");
        System.out.println("***\n\n");

        for (Integer i = this.numberOfDice; i <= numberOfBins; i++) {
            sb = new StringBuffer("");
            binValue = this.bins.getBin(i);
            percentofToss = (float)binValue/ (float) this.numberOfTosses;
            //System.out.println (" percentofToss - "+percentofToss);
            numberOfStars = (int) Math.round (binValue/10000);
            sb.append(String.format("%2d" ,i));
            sb.append(String.format(" :%9d", binValue ));
            sb.append(String.format(": %6.2f", percentofToss ));
            //sb.append(percentofToss);
            sb.append(" ");
            for (int j=0; j< numberOfStars; j++){
                sb.append("*");
            }
            sb.append("\n");
            System.out.println(sb.toString());

        }

    }

    public static void main (String args[]) {

        Simulation s = new Simulation(2, 1000000);
        s.runSimulation();
        s.printResults();

    }


}
