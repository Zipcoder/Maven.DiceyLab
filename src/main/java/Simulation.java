public class Simulation {
    private Integer numberOfDice;
    private Integer numberOfTosses;
    private Bins bin;

    public Simulation(Integer numberOfDice, Integer numberOfTosses){
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        bin = new Bins(new Dice(numberOfDice));
    }

    public void runSimulation(){
        bin.runTrial(numberOfTosses);
    }

    public void getDisplay(){
        StringBuilder output = new StringBuilder();
        Dice d = bin.getDice();
        for(int i = d.getQuantity(); i <= d.getHighestRoll(); i++){
            Double percent = bin.getRawResults()[i] / new Double(numberOfTosses);
            output.append(String.format("%4d :%9d :%5.2f ", i, bin.getRawResults()[i], percent));
            output.append(getStars(percent));
            output.append("\n");
        }
        System.out.println(output.toString());
    }

    public String getStars(Double multiplier){
        String stars = "";
        for(int i = 0; i < (int)(150 * multiplier); i++){
            stars += "*";
        }
        return stars;
    }
}
