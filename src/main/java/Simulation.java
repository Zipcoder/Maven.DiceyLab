public class Simulation {

    public static void main(String[] args) {
        Simulation simulate = new Simulation();

        simulate.simulate2Dice(1000000);


    }

    public void simulate2Dice(int timesToSimulate) {
        int counter = 0;
        Bins results = new Bins();
        while (counter < timesToSimulate) {
            results.storeBin(Dice.diceToss2());
            counter++;
        }
        System.out.println(" 2 :     " + results.two + " : percentage **" );
        System.out.println(" 3 :     " + results.three + " : percentage **" );
        System.out.println(" 4 :     " + results.four + " : percentage **" );
        System.out.println(" 5 :    " + results.five + " : percentage **" );
        System.out.println(" 6 :    " + results.six + " : percentage **" );
        System.out.println(" 7 :    " + results.seven + " : percentage **" );
        System.out.println(" 8 :    " + results.eight + " : percentage **" );
        System.out.println(" 9 :    " + results.nine + " : percentage **" );
        System.out.println(" 10:     " + results.ten + " : percentage **" );
        System.out.println(" 11:     " + results.eleven + " : percentage **" );
        System.out.println(" 12:     " + results.twelve + " : percentage **" );
    }

//    public void printResults2Dice(int timesToSimulate) {
//        Bins results = new Bins();
//        simulate2Dice(timesToSimulate);
//        System.out.println(" 2 :      " + results.two + ": percentage **" );
//        System.out.println(" 3 :      " + results.three + ": percentage **" );
//        System.out.println(" 4 :      " + results.four + ": percentage **" );
//        System.out.println(" 5 :      " + results.five + ": percentage **" );
//        System.out.println(" 6 :      " + results.six + ": percentage **" );
//        System.out.println(" 7 :      " + results.seven + ": percentage **" );
//        System.out.println(" 8 :      " + results.eight + ": percentage **" );
//        System.out.println(" 9 :      " + results.nine + ": percentage **" );
//        System.out.println(" 10:      " + results.ten + ": percentage **" );
//        System.out.println(" 11:      " + results.eleven + ": percentage **" );
//        System.out.println(" 12:      " + results.twelve + ": percentage **" );
//
//    }





}
