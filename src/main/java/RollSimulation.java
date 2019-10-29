import javax.print.attribute.standard.PrintQuality;



public class RollSimulation {
    private Dice dice;
    private Bins bins;
    private Integer numberOfDiceBeingRolled;
    private Integer numberOfThrows;

//    public RollSimulation(Integer numberOfDiceBeingRolled, Integer numberOfThrows)
//    {
//        this.numberOfDiceBeingRolled = numberOfDiceBeingRolled;
//        this.numberOfThrows=numberOfThrows;
//    }

    public void runSimulation (numberOfThrows, numberOfDiceBeingRolled) {
        Dice myDie = new Dice();
        int sumResult = 0;
        for (int i=1; i <= numberOfThrows; i++)
        {
            for (int j = 1; j <= numberOfDiceBeingRolled
            sumResult += dice.rollDie1();
            counter.incrementBin(sumResult);
        }
}
public void printResults()
{
    System.out.println("\nThis is a test");
    System.out.println("Simulation of rolling "+ numberOfDiceBeingRolled + " " + numberOfThrows + " times.");
    System.out.println("Begin test results");
    String s = "*";
    for (int i = numberOfDiceBeingRolled; i <= numberOfDiceBeingRolled * 6; i++)
    {
        Double per = (bins.getBin(i)/ (double)numberOfThrows*100);
        System.out.print(String.format("%d: %7: %2.0f percent: ", i, bins.getBin(i), per));
        for (int j = 0; j < per; j++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }

}
}
