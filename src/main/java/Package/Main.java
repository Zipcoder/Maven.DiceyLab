package Package;

public class Main {
    public static void main(String[] args){
        Dice dice = new Dice(2);
        for (int i =0; i <dice.numberOfRolls;i++) {
            Integer toss = dice.tossAndSum();
            System.out.println(toss);
        }

        Bins results = new Bins(2,12);
        for(int i = 0; i < 10; i++){
            results.incrementBin(toss);
        }
        for(int i =results.min; i <= results.max;i++){
            results.getBin(i);
        }
    }


}
