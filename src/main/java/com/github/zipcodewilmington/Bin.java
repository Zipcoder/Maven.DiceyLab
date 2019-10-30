package com.github.zipcodewilmington;

public class Bin {
    private final Integer valueToBeTracked;
    private Integer numberOfOccurences;


    public Bin(Integer valueToBeTracked) {
        this.valueToBeTracked = valueToBeTracked;
        this.numberOfOccurences = 0;
    }
    public Integer getValueToBeTracked() {
        return valueToBeTracked;
    }

    public Integer getNumberOfOccurences() {
        return numberOfOccurences;
    }

    public void increment() {
        numberOfOccurences++;
    }

}
