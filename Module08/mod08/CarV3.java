package Module08.mod08;

import java.io.PrintWriter;

public class CarV3 {
    
    car1{
    }
    
    public int calcDistance(int startMiles1, int endMiles1) {
        //Insert def for start and end Miles here
        //Calculate distance
        endMiles1 - startMiles1;
    }
    
    public double calcMPG(int distance1, double gallons1) {
        distance1 = calcDistance;
        //Define gallons here
        gallons1 = calcDistance / gallons1;
    }
    
    public void carType() {
        System.out.print("2006 Dodge Grand Caravan");
    }
    
    public void output() {
        System.out.printf("%10.3f%n", "Gas Mileage Calculations");
        System.out.printf("%10.3f%n", "Type of Car", "%10.3f%n", "Start Miles", "%10.3f%n", "End Miles", "%10.3f%n", "Distance", "%10.3f%n", "Gallons", "%10.3f%n", "Miles/Gallons");
        System.out.print("=======================================================");
        System.out.printf("%10.3f%n", carType, "%10.3f%n", startMiles1, "%10.3f%n", endMiles1, "%10.3f%n", calcDistance, "%10.3f%n", gallons1, "%10.3f%n", calcMPG);
        
    }
    
    public static void main(String[] args) {
        
        CarV3 car1 = new CarV3();
        car1.output();
    }
    
}