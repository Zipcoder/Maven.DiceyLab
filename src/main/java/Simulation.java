public class  Simulation {


Integer dice;
Integer rolling;
Bins newBin;
Integer key;


    public static void main(String[] args) {
        Simulation simulation = new Simulation(2,1000000);
        simulation.runSimulation();
        simulation.printResults();

    }

    public Simulation(int dices, int rolling) {
        this.dice= dices;
        this.rolling = rolling;

    }


    public Bins runSimulation(){
        Dice trial = new Dice(dice);
        newBin = new Bins(dice,dice*6);
        int i = 0;
        while(i<rolling) {

            key = trial.tossAndSum();

            newBin.addToBin(key);

            i++;

        }
        return newBin;

    }
    public void printResults(){
        int j=0;
        String name ="";

        for (int i = dice; i <=dice*6 ; i++) {
           int numOfStars = Integer.parseInt(Integer.toString(newBin.getBin(i)).substring(0,1));
           if (numOfStars==1){
               numOfStars= Integer.parseInt(Integer.toString(newBin.getBin(i)).substring(0,2));
           }

            newBin.getBin(i);
            name += String.format("%2d",i) + " : "
                    +String.format("%8d",newBin.getBin(i))+ " : "
                    +String.format("%5.2f",(float)newBin.getBin(i)/(float)rolling)
                    +printStars(numOfStars)+ "\n";


        }
        System.out.println(name);


    }

    public String printStars(Integer starsNumber){
        String empty="";
        for (int i = 0; i <starsNumber ; i++) {
            empty +="*";
        }return empty;

        }

}

