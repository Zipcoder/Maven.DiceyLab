import java.sql.SQLOutput;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Simulation{
    int numOfDice;
    int tosses;
    int maxSum;
    Dice dice;
    Bins bin;

    public Simulation(int numberOfDies, int numberOfTosses){
        this.numOfDice = numberOfDies;
        this.tosses = numberOfTosses;
        this.maxSum = numberOfDies *6;

        dice = new Dice(numberOfDies);
        bin = new Bins(numberOfDies,maxSum);
    }

    public void runSimulation() {

        Random rand = new Random();

        for(int x = 1; x <= tosses; x++){
            int sum =0;
            for(int z = 1; z <= numOfDice; z++){
                int random = rand.nextInt(6)+1;
                sum += random;
            }

            for(int i = 0; i <= bin.sums.size(); i++){
                if(i + numOfDice == sum){
                    bin.sums.set( i , bin.sums.get(i) + 1);
                }
            }
        }

    }

    public void printResults(){

        System.out.println("\n" +"Simulation of " + numOfDice + " dice tossed for " + tosses + " times." + "\n");

        for(int x = numOfDice; x <= maxSum; x ++){

            double count = this.bin.sums.get(x - numOfDice);
            double percentage = count / tosses;
            String perc = String.format("%.2f", percentage);

                    String preNumSpace = "";
            if(count < 100000 && count > 10000){
                preNumSpace = "    ";
            }else{
                preNumSpace = "   ";
            }
            String output = x + " :" + preNumSpace + count + " : " + perc;
            if(x < 10){
                System.out.println(" " + output);
            }else {
                System.out.println(output);
            }
        }
    }


    // ********************** MAIN ************************************//

    public static void main(String[] args){

        Simulation firstTry = new Simulation(2,1000000);
        firstTry.runSimulation();
        firstTry.printResults();
    }
}
