package Module04.mod04;

import java.util.Scanner;

/**
 * Project title: 04.05 BMI
 * 
 * Purpose of Project: A program to calculate you BMI.
 * 
 * @version 12/3/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Learned how to use material from before to create this program.
 * 
 * (-) Formatting took some time.
 * ***************************
 * 
 * In the future: Practice.
 */

public class BMI {
	
	public static void main(String[] args) {
		
		//Import the scanner class
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		//Declare variables
		String name;
		int weight;
		int foot;
		double inches;
		int pounds;
		@SuppressWarnings("unused")
		double feet;
		double kiloPerPound = 2.2046;
		double feetPerMeter = 3.2808;
		double meters;
		double kilograms;
		double BMI;
		double inchesConvert;
		double footConvert;
		
		//Ask the user for input
		System.out.println("What is your name? (First, Last)  ");
		name = in.nextLine();
		System.out.println("How much do you weight? (Pounds - e.g 179)  ");
		weight = in.nextInt();
		System.out.println("How tall are you? (Feet / Inches e.g 5 11)  ");
		foot = in.nextInt();
		inches = in.nextInt();
		System.out.print("\n");
		
		//Convert feet/inches to meters
		inchesConvert = inches / 12;
		footConvert = foot + inchesConvert;
		meters = footConvert / feetPerMeter;
		
		//Convert pounds to kilograms
        pounds = weight;
        kilograms = pounds / kiloPerPound;
		
		//BMI Formula
        //Formula used: http://www.cdc.gov/healthyweight/assessing/bmi/adult_bmi/index.html#Interpreted
        double metersSquared = (meters * meters);
		BMI = (kilograms / metersSquared);
		
		// Standard weight status
		String Category = null;
		
		if (BMI <= 18.5) {
			String underweight = "Underweight";
			Category = underweight;
		}
		else if (BMI <=24.9) {
			String normal = "Normal";
			Category = normal;
		}
		else if (BMI <=29.9) {
			String overweight = "Overweight";
			Category = overweight;
		}
		else {
			String obese = "Obese";
			Category = obese;
		}

		//User output
		System.out.println("Body Mass Calculator");
		
		System.out.println("Name: " + name);
		System.out.println("Weight (kg): " + kilograms);
		System.out.println("Height (m): " + meters);
		System.out.println("BMI: " + BMI);
		System.out.println("Category: " + Category);
		
	}

}
