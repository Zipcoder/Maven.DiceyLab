public class Dice {
    private Integer faces;

    public Dice(Integer faces) {
        this.faces = faces;
    }

    public Integer roll() {
        return (int)(Math.random() * 6 + 1);
    }
}
