package mod04;

import java.util.Scanner;

/**
 * Project title: 04.04 BMR
 * 
 * Purpose of Project: Calculate the BMR of the user.
 * 
 * @version 12/2/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Tied in methods used from previous projects.
 * 
 * (-) Getting the formula to work was a bit challenging.
 * ***************************
 * 
 * In the future: Get the formula to work easier.
 */

public class BMR {
	
	public static void main(String[] args) {
		
		// Declare the scanner
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		// Declare variables
		String name;
		String gender;
		int age;
		int height;
		int weight;
		int pounds;
		double inches;
		double cm;
		double kilograms;
		double rate = 0;
		double kilosPerPound = 2.2046;
		double inchesPercm = 2.54;
		
		// Ask the user for their name
		System.out.println("What is your name? (First, Last)  ");
		name = in.nextLine();
		
		// Ask the user if they are male or female
		System.out.println("Are you male or female? (M/F)");
		gender = in.nextLine();
		
		// Ask the user for their age
		System.out.println("How old are you?");
		age = in.nextInt();
		
		// Ask the user for their height (Inches)
		System.out.println("What is your height? (Inches)");
		height = in.nextInt();
		
		// Convert the height from inches to cm
		inches = height;
		cm = inches * inchesPercm;
		
		// Ask the user for their weight (Pounds)
		System.out.println("How much do you weight? (Pounds)");
		weight = in.nextInt();
		
		// Convert the weight from pounds to kilograms
		pounds = weight;
		kilograms = pounds / kilosPerPound;
		
		System.out.println("Calculate your Basal Metabolism");
		System.out.print("\n");
		
		// Calculate the users Basal Metabolism based on gender
		//EQUATION USED: http://en.wikipedia.org/wiki/Harris%E2%80%93Benedict_equation
		//The original Harris–Benedict equations published in 1918 and 1919.
		boolean isMale = gender.startsWith("M");
		if (isMale == true) {
			rate = (66.473 + (13.7516 * kilograms) + (5.0033 * cm) - (6.7550 * age));
		}
		else {
			rate = (655.0955 + (9.5634 * kilograms) + (1.8496 * cm) - (4.6756 * age));
		}
		
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Height (cm): " + cm + " cm");
		System.out.println("Weight (kg): " + kilograms + " kg");
		System.out.println("Basal Metabolism Rate: " + rate + " cal");
	}

}
