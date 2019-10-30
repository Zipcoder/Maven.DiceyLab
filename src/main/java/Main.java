//import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {





        Scanner sc = new Scanner(System.in);
        System.out.println("\nHow many dice would you like to roll?");
        Integer numberOfDiceBeingRolled = sc.nextInt();
        System.out.println("\nHow many times do you want to roll the dice?");
        Integer numberOfRolls = sc.nextInt();

        Bins bin = RollSimulation.runSimulation(numberOfRolls, numberOfDiceBeingRolled);
        printResults(bin, numberOfRolls);
    }

public static Double[] getPercent(Bins bin, Integer numberOfRolls)
{
    Double [] percents = new Double[13];
    for (int i =2; i< bin.getBinsArray().length; i++)
    {
        percents[i] = ((double) bin.getBin(i)) / numberOfRolls;
    }
    return percents;
}

public static String starResults(Double percent)
{
    int numOfStars = (int) (percent * 100);
    StringBuilder sb = new StringBuilder();
    for (int i =0; i< numOfStars; i++){
      sb.append("*");
    }
    return sb.toString();
}

public static void printResults (Bins bin, Integer numberOfRolls)
{
    Double[] percents = getPercent(bin, numberOfRolls);
    StringBuilder output = new StringBuilder();
    for (int i = 2; i< bin.getBinsArray().length; i++){
        output.append(String.format("%s\t:  %8s : %8.2f\t%s\n", i, bin.getBin(i), percents[i], starResults(percents[i])));
    }
    System.out.println(output.toString());
}

    //public void printResults()
//{
//    System.out.println("\nThis is a test");
//    System.out.println("Simulation of rolling "+ numberOfDiceBeingRolled + " " + numberOfThrows + " times.");
//    System.out.println("Begin test results");
//    String s = "*";
//    for (int i = numberOfDiceBeingRolled; i <= numberOfDiceBeingRolled * 6; i++)
//    {
//        Double per = (bins.getBin(i)/ (double)numberOfThrows*100);
//        System.out.print(String.format("%d: %7: %2.0f percent: ", i, bins.getBin(i), per));
//        for (int j = 0; j < per; j++)
//        {
//            System.out.print("*");
//        }
//        System.out.print("\n");
//    }
//
//}
//}


}
