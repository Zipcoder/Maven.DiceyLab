
import java.util.ArrayList;
import java.util.Random;


class Bins {
    int leastSum;
    int highestSum;

    ArrayList<Integer> sums = new ArrayList<Integer>();

    // Bin constructor - called with each new instance of Simulation
    public Bins(int leastSumIn, int highestSumIn){
        this.leastSum = leastSumIn;
        this.highestSum = highestSumIn;
        for(int X = leastSumIn; X <= highestSumIn; X++){
            sums.add(0);
        }
    }

    // Retrieve count from bin holding the specified sum
    public int getBin(int number){
        return sums.get(number - leastSum);
    }

    // Retrieve Most Occuring Sum in the bin
    public int mostOccuring(){

        int mostOccuringSum = 0;
        for(int x = 0; x <= this.sums.size() -1; x++){
            if(sums.get(x) > mostOccuringSum){
                mostOccuringSum = x + leastSum;
            }
        }
        return mostOccuringSum;
    }

    // Retrieve Least Occuring Sum in the bin
    public int leastOccuring(){

        int leastOccuringSum = this.mostOccuring();

        for(int x = 0; x <= this.sums.size() -1; x++){
            if(sums.get(x) < leastOccuringSum){
                leastOccuringSum = x + leastSum;
            }
        }
        return leastOccuringSum;
    }
}
