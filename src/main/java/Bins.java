
public class Bins {
    Integer firstRes;
    Integer lastRes;
    Integer storedResults[];

    //Create an array with possible results and populate it with 0
    public Bins(Integer firstRes, Integer lastRes){

        this.firstRes = firstRes;
        this.lastRes = lastRes;
        Integer arrayLength = lastRes + 1;

        this.storedResults = new Integer[arrayLength];

        for(int index = firstRes; index < storedResults.length; index++){
            storedResults[index] = 0;
        }
    }

    //Return results store in bin
    public Integer getBin(Integer indexOfBin){

        return storedResults[indexOfBin];
    }

    //Increment the results in bin
    public void incrementBin(Integer indexOfBin){

        storedResults[indexOfBin]++;
    }

}
