
public class Bins {
    private Dice dice;
    private Integer results[];

    public  Bins(){
        this(new Dice());
    }

    public  Bins(Dice dice){
        this.dice = dice;
        results = new Integer[dice.getHighestRoll() + 1];
    }

    public Integer[] getResults(){
        return results;
    }
}
