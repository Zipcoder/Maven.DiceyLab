public class Dice {

    public static void main(String[] args) {
        Dice dice = new Dice(2);
        Integer testInt = dice.tossAndSum();
        System.out.println(testInt);
    }
        private int numberOfDie;

        public Dice(int numOfDie){
            this.numberOfDie = numOfDie;
        }

        public int tossAndSum(){
            int sum = 0;
            for (int i = 0; i < numberOfDie; i++) {
                sum += ((Math.random()*6)+1);
            } // 0.0000001 - 0.9999999

            return sum;
    }
}
