public class Dice {
    private int dicesRolled;

    public Dice(int dicesRolled){
        this.dicesRolled = dicesRolled;
    }

    public Integer tossAndSum(){
        int sumOfDiceRoll = 0;
        for (int i = 0; i < dicesRolled; i++) {
            int indiDices = (int)(Math.random()*6+1);
            sumOfDiceRoll += indiDices;

        }
        return sumOfDiceRoll;
    }
    public Integer getNumOfDicesRolled(){
        return this.dicesRolled;
    }
}
