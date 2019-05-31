public class Dice {

    private Integer result[];
    private Integer sides;

    public Dice(Integer quantity, Integer sides) {
        this.result = new Integer[quantity];
        this.sides = sides;
    }

    public Dice(){
        this(2,6);
    }

    public void setSides(Integer sides){
        this.sides = sides;
    }

    public Integer getSides(){
        return sides;
    }
}
