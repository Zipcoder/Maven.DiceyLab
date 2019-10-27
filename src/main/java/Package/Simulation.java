package Package;

public class Simulation {
    Integer numberOfDice;
    Integer numberOfRolls;

    public Simulation(){};
    public Simulation(Integer numberOfDice, Integer numberOfRolls){
        this.numberOfDice = numberOfDice;
        this.numberOfRolls = numberOfRolls;
    }
    Bins results = new Bins(2,12);

    void runSimulation(){
        Dice dice = new Dice(2);
        Integer toss;

        for(int i = 0; i < numberOfRolls; i++){
            toss = 0; //Sets toss back to zero before new roll
            for (int j =0; j <dice.numberOfDice;j++) {
                toss += dice.tossAndSum();
            }
            results.incrementBin(toss);
        }
    }

    void printSimulation(){
        for(int i =results.min; i <= results.max;i++){
            System.out.println(i + " : " + results.getBin(i) + ": " + "needs fomatting");
        }
    }


}
