import org.junit.Test;
import org.junit.Assert;

public class SimulationTests {

    @Test
    public void SimulationConstructorTest(){

        int expectedDice = 4;
        int expectedTosses = 10;
        int expectedMaxSum = expectedDice * 6;

        Simulation constructorTest = new Simulation(expectedDice,expectedTosses);

        int instanciateDice = 4;
        boolean instantiateBin = true;

        Assert.assertEquals(expectedDice, constructorTest.numOfDice);
        Assert.assertEquals(expectedTosses, constructorTest.tosses);
        Assert.assertEquals(expectedMaxSum, constructorTest.dice.maxSum());
        Assert.assertEquals(instanciateDice, constructorTest.dice.diceNum);
        Assert.assertEquals(instantiateBin, constructorTest.bin.sums.size() > 0);

    }

    @Test
    public void runSimulationTest(){
        Simulation firstTry = new Simulation(8,100);
        firstTry.runSimulation();

        int expected = firstTry.maxSum - firstTry.numOfDice +1;
        int actual = firstTry.bin.sums.size();
        Assert.assertEquals(expected, actual);
    }



}
