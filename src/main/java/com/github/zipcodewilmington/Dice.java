package com.github.zipcodewilmington;

public class Dice {
    //private final Integer numberOfDie; <- unneded because we can call dice.length will get number of die
    private final Integer numberOfFaces;
    private final Die[] dice;

    public Dice(Integer numberOfDie, Integer numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
        this.dice = new Die[numberOfDie];

        for (int i = 0; i < dice.length; i++) {
             dice[i] = new Die(numberOfFaces);
        }
    }
    public Integer rollAndSum() {
        Integer total = 0;

        for (int i = 0; i < dice.length; i++) {
            Die die = dice[i];
            die.roll();
            Integer valueRolled = die.getCurrentFaceValue();
            total += valueRolled;
        }
        return total;
    }

    public Integer getRollMin() {
        Integer minValueToBeRolled = getNumberOfDie();
        return minValueToBeRolled;
    }
    public Integer getRollMax() {
        return getNumberOfDie() * numberOfFaces;
    }

    public Integer getNumberOfDie() {
        return dice.length;
    }

}
