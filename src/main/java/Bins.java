import com.sun.tools.corba.se.idl.IncludeGen;

import java.util.ArrayList;


public class Bins {
public Integer sumResult;

public Integer[] counter = new Integer[10];


    //public ArrayList<Integer> results = new ArrayList<Integer>(12);

//    public Integer getBin(Integer binIndex)
//    {
//        return counter [binIndex];
//    }

    public void incrementBin(Integer sumResult)
    {
        counter[sumResult - 2]++;
    }
}
