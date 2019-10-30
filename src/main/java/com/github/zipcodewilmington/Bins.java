package com.github.zipcodewilmington;

public class Bins {
    private final Bin[] bins;

    public Bins(Integer minFaceValue, Integer maxFaceValue) {
        Integer numberOfBins = maxFaceValue - minFaceValue;
        this.bins = new Bin[numberOfBins]; // each bin will keep track of individuals face values

        for (int i = 0; i < bins.length; i++) {
            Integer currentValue = minFaceValue + i;
            bins[i] = new Bin (currentValue); //creating a new bin that keeps track of the current calue
            //Bin currentElement = bins[i]; null every time until you populate array

        }
    }
    public Bin getBin(Integer valueToTrack) {
        for (int i = 0; i < bins.length; i++) {
            Bin bin = bins[i];
            Integer binFaceValue = bin.getValueToBeTracked();
            if(valueToTrack.equals(binFaceValue)) {
                return bin;
            }
        }
        return null;
    }
    public void incrementBin(Integer valueToIncrement) {
        Bin bin = getBin(valueToIncrement);
        bin.increment();
    }
    public Bin[] getBins() {
        return bins;
    }
}