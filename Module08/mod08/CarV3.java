package Module08.mod08;

import java.io.PrintWriter;

public class CarV3 {
    
    public car1 {
        
        
        
    }
    
    public int calcDistance(int startMiles1, int endMiles1) {
        //Insert def for start and end Miles here
        //Calculate distance
        return endMiles1 - startMiles1;
    }
    
    public double calcMPG(int distance1, double gallons1) {
        return ((double)calcDistance()) / gallons1;
    }
    
    public void carType() {
        System.out.print("2006 Dodge Grand Caravan");
    }
    
    public void output() {
        System.out.println("                             Gas Mileage Calculations                     ");
        System.out.println("      Type of Car         Start Miles   End Miles   Distance   Gallons   Price   Cost   Miles/Gal   Gal/Mile");
        System.out.println("===========================================================================================================");
        System.out.printf("%3s %10d %11d %11d %11.1f %7.1f %8.1f %8.1f %10.2f\n", car1.carType, car1.startMiles, car1.endMiles, car1.calcDistance(), car1.gallonsUsed, car1.pricePerGallon,  car1.calcCost(), car1.calcMPG(), car1.calcGPM());
        
    }
    
    public static void main(String[] args) {
        
        CarV3 car1 = new CarV3();
        car1.output();
    }
    
}