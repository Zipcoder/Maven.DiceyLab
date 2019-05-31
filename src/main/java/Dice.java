public class Dice {

    Integer numDice;

    public Dice() {
    }

    public Dice(Integer numDice) {
        this.numDice=numDice;
    }

    public Integer toss(){
        Integer total=0;
        for(int i=0;i<numDice;i++) {
            total+=(int)(6*Math.random()+1);
        }
        return total;
    }
}
