/**
 * @author Max Tuchman (me@mbtuchman.com)
 *
 * -=-=-=-= Begin PMR (Post Mortem Review) =-=-=-=-
 * Pluses:
 * + I finally understood declared variables in Java
 * 
 * Minuses:
 * - Took way to long to write out conversions.
 * -=-=-=-= End PMR (Post Mortem Review) =-=-=-=-
 */

public class MeasurementConverterV1
{
    public static void main(String[ ] args)
    {
        // Local variables
        double miles; // distance in miles
        double feet; // distance in feet
        double kilometers; // distance in kilometers
        double kilograms; // weight in kilograms
        double pounds; // weight in pounds
        double gallons;	// volume in gallons
        double liters; // volume in liters
        double inches; // distance in inches
        double feetPerInch = 0.083333; // feet per inch
        double inchesPerFoot = 12.000; // inches per foot
        double litersInGallon = 3.785411784; // lts in gallon
        double litersPerGallon = 0.26417; // lts per gallon
        double kiloPerPound = 2.2046; // kg per lb
        double feetPerMile = 5280; // feet per mile
        double kilometersPerMile = 0.62137; // km per mile

        // Converts feet to miles
        feet = 6230;
        miles = feet / feetPerMile;
        System.out.println(feet + " ft. = " + miles + " mi.");

        // Converts miles to feet
        miles = 2;
        feet = miles * feetPerMile;
        System.out.println(miles + " miles = " + feet + " ft.");
        
        // Converts miles to kilometers
        miles = 1;
        kilometers = miles / kilometersPerMile;
        System.out.println(miles + " miles = " + kilometers + " km.");
        
        // Converts kilometers to miles
        kilometers = 1;
        miles = kilometers * kilometersPerMile;
        System.out.println(kilometers + " km = " + miles + " miles.");
        
        // Converts pounds to kilograms
        pounds = 1;
        kilograms = pounds / kiloPerPound;
        System.out.println(pounds + " lb = " + kilograms + " kg.");
        
        // Converts kilograms to pounds
        kilograms = 1;
        pounds = kilograms * kiloPerPound;
        System.out.println(kilograms + " kg = " + pounds + " lb.");
        
        // Converts gallons to liters
        gallons = 1;
        liters = gallons / litersInGallon;
        System.out.println(gallons + " gal lqd = " + liters + " liters.");
        
        // Converts liters to gallons
        liters = 1;
        gallons = liters * litersPerGallon;
        System.out.println(liters + " liters = " + gallons + " gal lqd.");
        
        // Converts feet to inches
        feet = 1;
        inches = feet * inchesPerFoot;
        System.out.println(feet + " ft = " + inches + " inch.");
        
        // Converts inches to feet
        inches = 1;
        feet = inches * feetPerInch;
        System.out.println(inches + " inch = " + feet + " ft.");

    } // method main end
} // class end

/**
 * TODO: Find easy way to convert units.
 */
