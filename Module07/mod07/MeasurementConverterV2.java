package Module07.mod07;

/**
 * Project title: 07.02 Defining New Static Methods-Part 1
 *
 * Purpose of Project: Explore new static methods.
 *
 * @version 1/19/2015
 *
 * @author Omar Rahman
 *
 * *********** PMR ***********
 * (+) Understood static methods.
 *
 * (-) Need more practice.
 * ***************************
 *
 * In the future: Practice.
 */

public class MeasurementConverterV2 {

    public static void printPurpose() {

        System.out.println("This program converts to and from");
        System.out.println("English and metric units of measure.");
        System.out.println("=====================================");

    }

    //convert feet to miles
    //the ft parameter receives the value of the feet argument passed from main method.
    public static double convertFeetToMiles(double ft)
    {
        return ft / 5280;
    }

    //convert miles to feet
    public static double convertMilesToFeet(double mi)
    {
        return mi * 5280;
    }

    //convert miles to kilometers
    public static double convertMilesToKilometers(double mi)
    {
        //return statement calculate kilometers goes here
        return mi * 5280;
    }

    //convert kilometers to miles
    public static double convertKilometersToMiles(double km)
    {
        //return statement to calculate miles goes here
        return km / 1.6;
    }

    //convert pounds to kilograms
    //method header to convert pounds to kilograms goes here
    public static double convertKilogramsToPounds(double kg) {
    	return kg * 2.046;
    }

    //convert liters to gallons
    public static double convertLitersToGallons(double gal) {
    	return gal / 0.26417;
    }
    
    //convert gallons to liters
    public static double convertGallonsToLiters(double liters) {
    	return liters * 0.26417;
    }

    @SuppressWarnings("unused")
	public static void main(String[ ] args) {
        //local variables
        double miles, feet, inches, pounds, gallons;
        double kilometers, kilograms, liters;

        //variable declaration and initialization

        printPurpose();                                    //invoke the printPurpose() method
        feet = 6230;
        miles = convertFeetToMiles(feet);            //invoke the convertFeetToMiles() static method and pass the feet variable as an argument
        System.out.printf("%8.1f ft. = %7.1f mi. %n", feet, miles);

        miles = 1.9;
        feet = convertMilesToFeet(miles);
        System.out.printf("%8.1f mi. = %7.1f ft. %n", miles, feet);

        miles = 22.3;
        kilometers = convertMilesToKilometers(miles);
        System.out.printf("%8.1f mi. = %7.1f km. %n", miles, kilometers);

        kilometers = 1000.0;
        miles = convertMilesToKilometers(kilometers);
        System.out.printf("%8.1f km. = %7.1f km. %n", miles, kilometers);

        pounds = 204;
        //call method to convert pounds to kilograms goes here
        kilograms = convertKilogramsToPounds(pounds);
        System.out.printf("%8.1f lb. = %7.1f km. %n", kilograms, pounds);

        kilograms = 160;
        pounds = convertKilogramsToPounds(kilograms);
        System.out.printf("%8.1f kg. = %7.1f km. %n", kilograms, pounds);

        gallons = 200;
        liters = convertGallonsToLiters(gallons);
        System.out.printf("%8.1f mi. = %7.1f km. %n", gallons, liters);

        liters = 170;
        gallons = convertGallonsToLiters(liters);
        System.out.printf("%8.1f mi. = %7.1f km. %n", liters, gallons);

    }

}
