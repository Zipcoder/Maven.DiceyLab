# Kris-Tof diceylab.Dice Toss

Create a diceylab.Dice class that acts like a set of N random-tossed dies.

```java
diceylab.Dice dice = new diceylab.Dice(2); // for craps
diceylab.Dice dice = new diceylab.Dice(5); // for yatzee

Integer toss = dice.tossAndSum();
```
make a couple unit tests for the diceylab.Dice class. 

Create a tracking class diceylab.Bins that can be used to track these results.

```java
diceylab.Bins results = new diceylab.Bins(2, 12); // for bins from 2..12
Integer numberOfTens = results.getBin(10); // returns the number of tens in the 10 bin
results.incrementBin(10); // should increment bin # 10

```
make a couple unit tests for the diceylab.Bins class.

Create a diceylab.Simulation class whose Constructor takes arguments:
    numberOfDies to throw
    numberOfTosses to run

Create a simulation where two dies are thrown one million times. Keep track of all results.

```java
diceylab.Simulation sim = new diceylab.Simulation(2, 10000);

sim.runSimulation();

sim.printResults();
```
You can use a main() to run the simulations.

In your pull requests, create a new file with your name as the filename.
Paul's would be PaulResults.md

Paste a copy of your text results into that file and then submit your pull request.

the results of the sim.printResults() should be an output string that looks like this:

```java
***
diceylab.Simulation of 2 dice tossed for 1000000 times.
***

 2 :    27917: 0.03 **
 3 :    55422: 0.06 *****
 4 :    83457: 0.08 ********
 5 :   110961: 0.11 ***********
 6 :   139098: 0.14 *************
 7 :   166977: 0.17 ****************
 8 :   138386: 0.14 *************
 9 :   111102: 0.11 ***********
10 :    83367: 0.08 ********
11 :    55799: 0.06 *****
12 :    27514: 0.03 **
```

