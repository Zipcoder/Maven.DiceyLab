import java.util.Random;

public class Dice {
    private Integer sides;
    private Integer quantity;

    public Dice(Integer quantity, Integer sides) {
        this.quantity = quantity;
        this.sides = sides;
    }

    public Dice(Integer quantity){
        this.quantity = quantity;
        this.sides = 6;
    }

    public Dice(){
        this(2,6);
    }

    public Integer roll(){
        Integer result = 0;
        Random r = new Random();
        for(int i = 0; i < quantity; i++){
            result += (r.nextInt(sides) + 1);
        }
        return result;
    }

    public Integer getHighestRoll(){
        return sides * quantity;
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

    public void setQuantity(Integer newSides){
        this.quantity = newSides;
    }
}
