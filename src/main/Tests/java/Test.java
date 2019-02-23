import org.junit.Assert;

public class Test {

    @org.junit.Test
    public void unitTest(){
        //Given
        Dice dice = new Dice(1); // for craps


        //When
        Integer toss = dice.tossAndSum();
        //Then
        Assert.assertTrue(toss>=1&&toss<=6);
    }
    @org.junit.Test
    public void binTest(){

        //Given
        Bins results = new Bins(2,12); // for bins from 2..12
        Integer expexted = 1;
        //When
         // returns the number of tens in the 10 bin
         // should increment bin # 10
        results.addToBin(10);
        Integer numberOfTens = results.getBin(10);

        //Then
        Assert.assertEquals(expexted,numberOfTens);


    }


}



