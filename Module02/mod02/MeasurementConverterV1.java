package mod02;

/**
 * Project title: 02.05 Arithmetic Expressions
 * 
 * Purpose of Project: MeasuermentConverter_v1 converts to and from Metric and English
 * units of measure.
 * 
 * @version 11/1/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Understood how local variable declarations work.
 * 
 * (-) Getting the formula to convert units took some time.
 * ***************************
 * 
 * In the future: Find an easier way to convert the units.
 */

public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        //local variable declarations - assign actual values below
        double miles;                   // distance in miles
        double feet;                    // distance in feet
        double kilometers;				// distance in kilometers
        double kilograms;				// weight in kilograms
        double pounds;					// weight in pounds
        double gallons;					// volume in gallons
        double liters;					// volume in liters
        double inches;					// distance in inches
        double feetPerInch = 0.083333;  // number of feet per inches
        double inchesPerFoot = 12.000;	// number of inches per foot
        double litersInGallon = 3.785411784;			// number of liters in a gallon
        double litersPerGallon = 0.26417;		// number of liters in one gallon
        double kiloPerPound = 2.2046;			// number of kilograms in a pound
        double feetPerMile = 5280;      //number of feet per 1 mile
        double kilometersPerMile = 0.62137; //number of kilometers per 1 mile
        //...finish declaring local variables here, including end of line
        //...comments doccumenting purpose of each variable


        //convert feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");


        //convert miles to feet
        miles = 2;
        feet = miles * feetPerMile;
        System.out.println(miles + " miles = " + feet + " ft.");
        
        //convert miles to kilometers
        miles = 1;
        kilometers = miles / kilometersPerMile;
        System.out.println(miles + " miles = " + kilometers + " km.");
        
        //convert kilometers to miles
        kilometers = 1;
        miles = kilometers * kilometersPerMile;
        System.out.println(kilometers + " km = " + miles + " miles.");
        
        //convert pounds to kilograms
        pounds = 1;
        kilograms = pounds / kiloPerPound;
        System.out.println(pounds + " lb = " + kilograms + " kg.");
        
        //convert kilograms to pounds
        kilograms = 1;
        pounds = kilograms * kiloPerPound;
        System.out.println(kilograms + " kg = " + pounds + " lb.");
        
        //convert gallons to liters
        gallons = 1;
        liters = gallons / litersInGallon;
        System.out.println(gallons + " gal lqd = " + liters + " liters.");
        
        //convert liters to gallons
        liters = 1;
        gallons = liters * litersPerGallon;
        System.out.println(liters + " liters = " + gallons + " gal lqd.");
        
        //convert feet to inches
        feet = 1;
        inches = feet * inchesPerFoot;
        System.out.println(feet + " ft = " + inches + " inch.");
        
        //convert inches to feet
        inches = 1;
        feet = inches * feetPerInch;
        System.out.println(inches + " inch = " + feet + " ft.");


    }//end of main method
}//end of class


