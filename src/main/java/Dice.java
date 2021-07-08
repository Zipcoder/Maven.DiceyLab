import java.util.ArrayList;
import java.util.List;

public class Dice {
    private List<Integer> diceContainer = new ArrayList<Integer>();
    private Integer numberOfDice;
    private Integer sumOfDice;

    public Dice(Integer numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public Dice(){
        this.numberOfDice = 2;
    }

    public Integer getNumberOfDice(){
        return this.numberOfDice;
    }

    public void setNumberOfDice(Integer numberOfDice){
        this.numberOfDice = numberOfDice;
    }

    public List<Integer> getDiceList(){
        return this.diceContainer;
    }

    public Integer getSumOfDice(){
        return this.sumOfDice;
    }

    public void initializeDiceList(){
        Integer numberOfDice = this.getNumberOfDice();
        List<Integer> diceList = this.getDiceList();
        for(int i = 0; i < numberOfDice; i++){
            diceList.add(0);
        }
    }



    public void tossDice(){
        Integer min = 1;
        Integer max = 7;
        List<Integer> diceList = this.getDiceList();
        Integer length = diceList.size();
        for(int i = 0; i < length; i++){
             diceList.set(i, (int)(Math.random() * (max - min)) + min);
        }
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        this.tossDice();
        List<Integer> diceList = this.getDiceList();

        for(int i = 0; i < diceList.size(); i++){
            sum += diceList.get(i);
        }
        this.sumOfDice = sum;
        return sum;
    }

    public void printDice(){
        List<Integer> diceList = this.getDiceList();
        for(int i = 0; i < diceList.size(); i++){
            System.out.println((i + 1) + ": " + diceList.get(i));
        }
    }
}
