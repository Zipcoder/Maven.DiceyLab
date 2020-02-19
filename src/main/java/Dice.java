public class Dice {
    private Integer rolled;


    public Dice(Integer rolled) {
        this.rolled = rolled;
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        for (int i = 1; i <= rolled; i++) {
            sum += (int) (Math.random()*6) + 1;
        }
        return sum;
    }

    public Integer getRolled() {
        return rolled;
    }
}
