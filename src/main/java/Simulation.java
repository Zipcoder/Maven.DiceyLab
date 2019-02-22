public class  Simulation {


Integer dices;
Integer rolling;
Bins newBin;
Integer key;


    public static void main(String[] args) {
        Simulation simulation = new Simulation(2,10);
        simulation.runSimulation();
        simulation.printResults();


    }

    public Simulation(int dices, int rolling) {
        this.dices= dices;
        this.rolling = rolling;

    }


    public Bins runSimulation(){
        Dice trial = new Dice(dices);
        Bins newBin = new Bins(dices,dices*6);
        int i = 0;
        while(i<rolling) {

            key = trial.tossAndSum();
            System.out.println(key);

            newBin.addToBin(key);

            i++;

            System.out.println(newBin.getBin(key));
        }
        return newBin;

    }
    public void printResults(){




            System.out.println( " :    " );



        }

    }

