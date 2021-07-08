import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Bins {
    private List<Integer> results = new ArrayList<>();
    private Integer min;
    private Integer max;

    public Bins(Integer min, Integer max){
        this.min = min;
        this.max = max;
        List<Integer> resultsList = this.getResults();
        for(int i = min; i <= max; i++){
            resultsList.add(0);
        }
    }

    public List<Integer> getResults() {
        return results;
    }

    public Integer getBin(Integer binNumber){

        return this.getResults().get(binNumber);
    }

    public void incrementBin(Integer binNumber){
        if(binNumber >= this.min && binNumber <= this.max){
            Integer binIndex = binNumber - this.min;
            Integer currentBinResult = this.getBin(binIndex);
            this.results.set(binIndex, currentBinResult + 1);
        }


    }

    public List<Double> tallyResults(Integer numberOfTosses){
        List<Double> percentages = new ArrayList<Double>();
        for(int i = 0; i < results.size(); i++){
            double percentage = (double)results.get(i) / numberOfTosses;
            BigDecimal bigDecimal = new BigDecimal(Double.toString(percentage));
            bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
            percentages.add(bigDecimal.doubleValue());
        }
        return percentages;
    }

    public void printResults(Integer numberOfTosses){
        List<Double> talliedResultList = tallyResults(numberOfTosses);
        Integer count = this.min;
        Integer i = 0;
        String printout = "";
        int numberOfStars = 0;
        for(Double element : talliedResultList) {
            numberOfStars = (int)(element * 100);
            i = 1;
            printout += String.format("%3d", count) + ":   " +   String.format("%7d", this.getBin(count - 2)) +
                    "  " + String.format("%1.2f", element) + "  ";
            while(i < numberOfStars){
                printout += "*";
                i++;
            }
            count++;
            printout += "\n";
        }
        System.out.println(printout);
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

}
