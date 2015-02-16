package Module05;

import java.util.Random;
import java.util.Scanner;

/**
 * Project title: 05.07 Challenge Program
 * 
 * Purpose of Project: Generate a random password with uppercase, lowercase, etc. based on user
 * selection.
 * 
 * @version 1/6/2015
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Got the hang of for methods more.
 * 
 * (-) Getting the loops to work took some trial and error.
 * ***************************
 * 
 * In the future: Practice.
 */

public class Password {
	
	public static void main(String[] args) {
		
		// Declare variables
		String lowercase = "abcdefghijklmnopqrstuvwxyz";
		String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String digits = "1234567890";
		String punctuation = "!@#$%^&*()_+=-.,/\';[]{}|:";
		String password = "";
		Random randomNumber = new Random();
		Random randomSelection = new Random();
		int loopSelection = 0;
		int choice = 0;
		int length = 0;
		
		//Construct the scanner method
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		
		//Prompt the user to select a menu
		System.out.println("Password Generator");
		System.out.println("**********************************************************");
		System.out.println("Select a number from the menu.");
		System.out.println("[1] Lowercase letters");
		System.out.println("[2] Lowercase & Uppercase letters");
		System.out.println("[3] Lowercase, Uppercase & Numbers");
		System.out.println("[4] Lowercase, Uppercase, Numbers and Punctuation");
		System.out.println("[5] Quit");
		System.out.println("**********************************************************");
		System.out.print("\n");
		
		// Prompt user for input
		System.out.println("Enter a selection (1-5): ");
		choice = in.nextInt();
		System.out.print("\n");
		if (choice < 5) {
			System.out.println("Choose a password length (1 - 14)");
			length = in.nextInt();	
		}
		
		// Choice 1
		if (choice == 1) {
			
			for (int i = 0; i < length; i++) {
				password += lowercase.charAt(randomNumber.nextInt(lowercase.length()));
			}
			
		}
		// Choice 2
		else if (choice == 2) {
			
			for (int i = 0; i < length; i++) {
				
				loopSelection = randomSelection.nextInt(2);
				
				if (loopSelection == 0) {
					password += lowercase.charAt(randomNumber.nextInt(lowercase.length()));
				}
				else if (loopSelection == 1) {
					password += uppercase.charAt(randomNumber.nextInt(uppercase.length()));
				}
			}
			
		}
		// Choice 3
		else if (choice == 3) {
			
			for (int i = 0; i < length; i++) {
				
				loopSelection = randomSelection.nextInt(3);
				
				if (loopSelection == 0) {
					password += lowercase.charAt(randomNumber.nextInt(lowercase.length()));
				}
				else if (loopSelection == 1) {
					password += uppercase.charAt(randomNumber.nextInt(uppercase.length()));
				}
				else if (loopSelection == 2) {
					password += digits.charAt(randomNumber.nextInt(digits.length()));
				}
			}
			
		}
		// Choice 4
		else if (choice == 4) {
			
			for (int i = 0; i < length; i++) {
				
				loopSelection = randomSelection.nextInt(4);
				
				if (loopSelection == 0) {
					password += lowercase.charAt(randomNumber.nextInt(lowercase.length()));
				}
				else if (loopSelection == 1) {
					password += uppercase.charAt(randomNumber.nextInt(uppercase.length()));
				}
				else if (loopSelection == 2) {
					password += digits.charAt(randomNumber.nextInt(digits.length()));
				}
				else if (loopSelection == 3) {
					password += punctuation.charAt(randomNumber.nextInt(punctuation.length()));
				}
			}
			
		}
		// Choice 5
		else if (choice == 5) {
			System.out.println("The program will exit now!");
		}
		// If 1 - 5 are not chosen
		else {
			System.out.println("Please choose a number between 1 and 5.");
		}
		// Print generated password
		if (choice < 5) {
			System.out.println("Password: " + password);
		}
	}
}
