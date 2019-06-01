public class Simulation {
    public static void main(String[] args) {
        Dice d = new Dice(1,2 );
        for(int i = 0; i < 20; i++){
            System.out.println(d.roll());
        }
    }
}
