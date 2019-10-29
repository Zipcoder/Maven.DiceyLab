package com.github.zipcodewilmington;

import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private final Integer numberOfFaces;
    private Integer currentFaceValue; //no constructor because this value is null until die is tosses

    public Die() {
        this(6); // this(6) the 6 is already defined as numberOfFaces
    }

    public Die(Integer numberOfFaces) {
        this.numberOfFaces = numberOfFaces;
    }
    // currentDaceValue is set to random value between 1 and numberOfFaces
    public void roll() {
        ThreadLocalRandom randomNumberGenerator = ThreadLocalRandom.current();
        Integer randomFaceValue = randomNumberGenerator.nextInt(1, numberOfFaces);
        this.currentFaceValue = randomFaceValue;
    }

    public Integer getCurrentFaceValue() {
        return currentFaceValue;
    }
}
// void and nullary methods change state of the object theyre working on
// instance variables are how we define the objects state