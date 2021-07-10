import java.math.BigDecimal;

public class Simulation {

    private Dice dice;
    private Bins bin;
    private Integer numOfToss;
    private Integer numOfDice;
    private Integer min;
    private Integer max;

    public Simulation(Integer numOfDice, Integer numOfToss){
        this.numOfToss = numOfToss;
        this.numOfDice = numOfDice;
        this.min = numOfDice;
        this.dice = new Dice(numOfDice);
        this.bin = new Bins(numOfDice, numOfDice * 6);
    }

    public void runSim(){
        for (int i = 0; i < numOfToss; i++) {
            bin.fillBins(dice.tossAndSum());
        }
    }

    public void printResult(){
        String result = "***\n" +
                        "Simulation of " + numOfDice + " dice tossed for " + numOfToss+ " times.\n" +
                        "***\n";
        Integer[] thisBin = bin.getBoxes();
        for(int i = 0; i < thisBin.length; i++) {
            int boxId = i + min;
            String addToResult = getBoxNumber(i) + " :" + getBoxValue(bin.getBin(i + min)) + " : " + bin.getPercent(i + min) +
                                " " + getStars(bin.getPercent(i + min)) + "\n";
            result += addToResult;
        }
        System.out.println(result);
    }

    private String getBoxNumber(Integer i){
        String result = ""; //3 spaces
        Integer numberSpaces = i + min;
        Integer whiteSpaces = 4 - numberSpaces.toString().length();
        for (int j = 0; j < whiteSpaces; j++) {
            result += " ";
        }
        result += numberSpaces.toString();
        return result;
    }

    private String getBoxValue(Integer value){
        String result = ""; //9 spaces
        Integer spaces = 9 - value.toString().length();
        for (int i = 0; i < spaces; i++) {
            result += " ";
        }
        result += value.toString();
        return result;
    }

    public String getStars(double number){
        StringBuilder result = new StringBuilder();
        double numOfStars = number * 100;
        for (int i = 0; i < numOfStars; i++) {
            result.append("*");
        }
        return result.toString();
    }

}
