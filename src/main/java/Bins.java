import com.sun.tools.corba.se.idl.IncludeGen;

import java.util.ArrayList;


public class Bins {
    Integer[] counter = new Integer[13];

    public Bins (Integer numberOfDiceRolled){
        for (int i = numberOfDiceRolled; i< 13; i++)
        {
            counter[i]=0;
        }
    }


        public Integer getBin(Integer sumResult) {
            return counter[sumResult];
        }

        public Integer[] getBinsArray ()
        {
            return counter;
        }


    //public static Integer sumResult;

//    public Integer[] createBins() {
//        Integer[] counter = new Integer[13];
//        return counter;
//    }

    public void incrementBin (Integer sumResult)
    {
         counter[sumResult]++;
    }
}

    //public ArrayList<Integer> results = new ArrayList<Integer>(13);


