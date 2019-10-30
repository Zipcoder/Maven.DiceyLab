
public class Bins {
    private Dice dice;
    private Integer results[];

    public  Bins(){
        this(new Dice());
    }

    public  Bins(Dice dice){
        this.dice = dice;
        results = new Integer[dice.getHighestRoll() + 1];
        for(int i = 0; i <= results.length-1; i++){
            results[i] = 0;
        }
    }

    public void runTrial(Integer numOfRolls){
        for(int i = 0; i < numOfRolls; i++){
            results[dice.roll()]++;
        }
    }

    public Integer[] getResults(){
        Integer[] trimmedResults = new Integer[results.length - dice.getQuantity()];
        for(int i = 0; i < trimmedResults.length; i++){
            trimmedResults[i] = results[dice.getQuantity() + i];
        }
        return trimmedResults;
    }

    public Dice getDice(){
        return dice;
    }

    public Integer[] getRawResults(){
        return results;
    }
}
