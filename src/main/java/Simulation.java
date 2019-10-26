public class Simulation {
    Integer numberOfDies;
    Integer numberOfTosses;
    Integer lastRes;

    public static void main(String[] args) {

        Simulation newSimulation = new Simulation(2, 1000000);
        newSimulation.printResults(newSimulation.runSimulation());
    }

    public Simulation(Integer numberOfDies, Integer numberOfTosses) {

        this.numberOfDies = numberOfDies;
        this.numberOfTosses = numberOfTosses;
        this.lastRes = numberOfDies * 6 + 1;
    }

    public Bins runSimulation(){

        Dice dice = new Dice(numberOfDies);
        Bins bin = new Bins(numberOfDies, lastRes);

        for (int start = 0; start < numberOfTosses; start++) {
            bin.incrementBin(dice.tossAndSum());
        }

        return bin;
    }

    public void printResults(Bins bin){

        System.out.println("***\n" + "Simulation of " + numberOfDies + " dice tossed for " + numberOfTosses + " times.\n***\n");

        for( int index = numberOfDies; index < lastRes; index++ ){
            int results = bin.getBin(index);
            double percentRes = ((double) bin.getBin(index)) / numberOfTosses;

                //Set number of stars to be printed
                String stars = "";
                int numOfStarts = (int)(percentRes * 100);

                for(int countOfStarts = 0; countOfStarts < numOfStarts; countOfStarts++ ) {
                stars = stars + "*";
                }

            System.out.println(String.format(" %2d : %8d : %1.2f  ", index, results, percentRes) + stars);
        }
    }

}


