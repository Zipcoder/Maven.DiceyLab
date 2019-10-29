package com.github.zipcodewilmington;

public class Dice {
    //private final Integer numberOfDie; <- unneded because we can call dice.length will get number of die
    private final Integer numberOfFaces;
    private final Die[] dice;

    public Dice(Integer numberOfDie, Integer numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
        this.dice = new Die[numberOfDie];
    }

    public Integer getNumberOfDie() {
        return dice.length;
    }

}
