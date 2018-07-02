package RailwayTrains;

public class Main {
    public static void main(String arg[]) {
        //Assemble trains
        Locomotive bigChief = new Locomotive(23, 5311);
        Locomotive steelHorse = new Locomotive(21, 5409);

        Train santaFe = new Train(bigChief);
        Train rioGrandeExpress = new Train(steelHorse);

        Car SFcar0 = new Car(12, 50);
        Car SFcar1 = new Car(15, 75);
        Car SFcar2 = new Car(20, 100);

        Car RGEcar0 = new Car(13, 60);
        Car RGEcar1 = new Car(18, 80);

        santaFe.add(0, SFcar0);
        santaFe.add(1, SFcar1);
        santaFe.add(2, SFcar2);

        rioGrandeExpress.add(0, RGEcar0);
        rioGrandeExpress.add(1, RGEcar1);

        //Print the information of trains
//        System.out.println("Before change, the information of both trains: \n");
//        System.out.println("Santa Fe:");
//        System.out.println(santaFe.toString());
//        System.out.println("Rio Grande Express: \n");
//        System.out.println(rioGrandeExpress.toString());

        // All cars of "Santa Fe" are taken over in the "Rio Grande Express"
        rioGrandeExpress.relink(santaFe);

        System.out.println("Rio Grande Express take over Santa Fe: \n");
        System.out.println(rioGrandeExpress.toString());

        // The carriage order in the "Rio Grande Express" is reversed.

        rioGrandeExpress.revert();

        System.out.println("The carriage order in the \"Rio Grande Express\" is reversed.\n");
        System.out.println(rioGrandeExpress.toString());


    }
}
