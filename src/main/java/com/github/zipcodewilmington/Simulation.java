package com.github.zipcodewilmington;

import java.util.Formatter;

public class Simulation {
    private Integer numberOfDie;
    private Integer numberOfTosses;
    private Bins bins;

    public Simulation(Integer numberOfDie, Integer numberOfRolls) {
        this.numberOfDie = numberOfDie;
        this.numberOfTosses = numberOfRolls;
    }

    public void run() {
        Dice dice = new Dice(numberOfDie, 6);
        Integer minValueToCheck = dice.getRollMin();
        Integer maxValueToCheck = dice.getRollMax();
        this.bins = new Bins(dice.getRollMin(), dice.getRollMax());

        for (int i = 0; i < numberOfTosses; i++) {
            Integer rollValue = dice.rollAndSum();
            bins.incrementBin(rollValue);
        }
    }

    public Double getPercentOfOccurances(Integer valueToCheck) {
        Bin bin = bins.getBin(valueToCheck);
        Integer numberOfOOccurences = bin.getNumberOfOccurences();
        Double ratio = numberOfOOccurences.doubleValue() / numberOfTosses;
        Double percentage = ratio * 100;
        return percentage;
    }

    @Override
    public String toString() {
        Formatter output = new Formatter();
        for (Bin bin : bins.getBins()) {
            Integer faceValue = bin.getValueToBeTracked();
            Double percentage = getPercentOfOccurances(faceValue);
            Integer starCount = percentage.intValue();
            String stars = new String(new char[starCount]).replace("\0", "*");
            output.format("%d : %d : %2f : %s%n", faceValue, bin.getNumberOfOccurences(), percentage, stars);

        }
        return output.toString();
    }


    public void printResults() {
        System.out.println(toString());
    }
}
