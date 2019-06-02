import java.util.Random;

public class Dice {

    private Integer result;
    private Integer sides;
    private Integer quantity;

    public Dice(Integer quantity, Integer sides) {
        this.quantity = quantity;
        this.sides = sides;
        this.result = 0;
    }

    public Dice(){
        this(2,6);
    }

    public Integer roll(){
        Random r = new Random();
        return r.nextInt(quantity * sides) + 1;
    }

    public Integer getHighestRoll(){
        return sides * quantity;
    }

    public void setQuantity(Integer newSides){
        this.quantity = newSides;
    }

    public Integer getQuantity(){
        return this.quantity;
    }

    public Integer getSides(){
        return sides;
    }

    public void setSides(Integer sides){
        this.sides = sides;
    }
}
