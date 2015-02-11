package Module08.mod08;

/**
 * Project title: 08.07 Constructing Multiple Objects
 *
 * Purpose of Project: Calculates the gas mileage on an example car.
 *
 * @version 2/11/2015
 *
 * @author Omar Rahman
 *
 * *********** PMR ***********
 * (+) Understood OOP more.
 *
 * (-) Need more practice with OOP.
 * ***************************
 *
 * In the future: Practice.
 */

public class CarV7Tester {

    public static void main(String[] args) {

        int startMiles;
        int startMiles2;
        int startMiles3;
        int endMiles;
        int endMiles2;
        int endMiles3;
        int distance;

        double mpg;
        double gals;
        double gals2;
        double gals3;
        double price;
        double cost;

        String type;
        String type2;
        String type3;

        gals = 11.7;
        startMiles = 110000;
        endMiles = 110100;
        price = 2.09;
        type = "2001 BMW 328i";

        gals2 = 15.2;
        startMiles2 = 20200;
        endMiles2 = 20300;
        type2 = "2015 Honda Fit";

        gals3 = 17.8;
        startMiles3 = 1100;
        endMiles3 = 1200;
        type3 = "2008 Ford Mustang";

        CarV7 car1 = new CarV7(type, startMiles, endMiles, gals * price, (endMiles - startMiles) / gals, gals / price);
        CarV7 car2 = new CarV7(type2, startMiles2, endMiles2, gals2 * price, (endMiles2 - startMiles2) / gals2, gals2 / price);
        CarV7 car3 = new CarV7(type3, startMiles3, endMiles3, gals3 * price, (endMiles3 - startMiles3) / gals3, gals3 / price);

        cost = car1.calcCost();

        System.out.println("                             Gas Mileage Calculations                     ");
        System.out.println("      Type of Car         Start Miles   End Miles   Distance   Gallons   Price   Cost   Miles/Gal   Gal/Mile");
        System.out.println("===========================================================================================================");
        System.out.printf("%3s %10d %11d %10d %11.1f %7.1f %8.1f %8.1f %10.2f\n", car1.getType(), car1.getStartMiles(), car1.getEndMiles(), car1.calcDistance(), car1.getGallonsUsed(), car1.getPricePerGallon(),  car1.calcCost(), car1.calcMPG(), car1.calcGPM());
        System.out.printf("%3s %15d %11d %11d %11.1f %7.1f %8.1f %8.1f %10.2f\n", car2.getType(), car2.getStartMiles(), car2.getEndMiles(), car2.calcDistance(), car2.getGallonsUsed(), car2.getPricePerGallon(),  car2.calcCost(), car2.calcMPG(), car2.calcGPM());
        System.out.printf("%3s %21d %11d %11d %11.1f %7.1f %8.1f %8.1f %10.2f\n", car3.getType(), car3.getStartMiles(), car3.getEndMiles(), car3.calcDistance(), car3.getGallonsUsed(), car3.getPricePerGallon(),  car3.calcCost(), car3.calcMPG(), car3.calcGPM());
    }

}
