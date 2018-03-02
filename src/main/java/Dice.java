public class Dice {

    private int numOfDice;
    private int minNum;
    private int maxNum;


    public Dice(){
        this(1);
    }

    public Dice(int numOfDice){
        this.numOfDice = numOfDice;
        this.minNum= numOfDice;
        this.maxNum = numOfDice * 6;
    }

    public int getMinNum() {
        return minNum;
    }

    public int getMaxNum() {
        return maxNum;
    }

    public int tossAndSum(){
        int rollSum = 0;
        for (int i = 0; i <numOfDice; i++){
            rollSum += (int) (Math.random() *6) + 1;
        }

        return rollSum;

    }

    public static void main(String[] args) {
        Dice dice = new Dice(1); // for craps
        Dice dice2 = new Dice(5); // for yatzee

        Integer toss = dice.tossAndSum();
        Integer toss2 = dice2.tossAndSum();

        System.out.println("The ressult of the first toss was " + toss);
        System.out.println("The result of the second toss waS " + toss2);



    }

//    public int rollDice(int numDice) {
//        return (int) (Math.random()*numDice*6);
//    }
}
