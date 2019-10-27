public class Simulation {

    Dice[] simulatedDice;
    Bins tallyStore;
    Integer runTimes;

    public Simulation() {
        this.simulatedDice = new Dice[2];
        for (int i = 0; i < simulatedDice.length; i++) {
            simulatedDice[i] = new Dice(6);
        }

        this.tallyStore = new Bins(13);
        this.runTimes = 1000;
    }

    public Simulation(Integer runTimes) {
        this.simulatedDice = new Dice[2];
        for (int i = 0; i < simulatedDice.length; i++) {
            simulatedDice[i] = new Dice(6);
        }

        tallyStore = new Bins(13);
        this.runTimes = runTimes;
    }

    public Simulation(Integer numDice, Integer runTimes) {
        this.simulatedDice = new Dice[numDice];
        for (int i = 0; i < simulatedDice.length; i++) {
            simulatedDice[i] = new Dice(6);
        }

        tallyStore = new Bins(6 * numDice + 1);
        this.runTimes = runTimes;
    }


    public void run() {
        for (int i = 0; i < runTimes; i++) {
            int sum =0;
            for (int j = 0; j < simulatedDice.length; j++) {
                sum += simulatedDice[j].roll();
            }
            tallyStore.tally(sum);
        }
    }

    public void printResults() {
        System.out.println("***\n" + "Simulation of " + simulatedDice.length + " dice tossed for " + runTimes + " times.\n" +"***\n");

        for (int i = simulatedDice.length; i <= simulatedDice.length * 6; i++) {
            String combNum = i + "";
            combNum = " ".repeat(5 - combNum.length()) + combNum;

            String tallyStr = tallyStore.getTally(i) + "";
            tallyStr = " ".repeat(8 - tallyStr.length()) + tallyStr;

            Double percent = (double)tallyStore.getTally(i) / runTimes;
            String percentStr = String.format("%.4f", percent);
            percentStr = " ".repeat(8 - percentStr.length()) + percentStr;

            String stars = "*".repeat((int)(percent * 250));

            System.out.println(combNum + " : " + tallyStr + " : " + percentStr + "  |" + stars);
        }
    }

}
