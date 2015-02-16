package Module03;

/**
 * Project title: 03.09 Challenge Program Beta
 * 
 * Purpose of Project: A program to calculate fines on overdue books for the CSA Media Center and the Media Center Specialist can copy and paste into an email.
 * 
 * @version 11/17/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Learned how to use previous methods learned in the past to help with this project.
 * 
 * (-) Getting the output to show up right took a while.
 * ***************************
 * 
 * In the future: Create more projects that use methods used in the past.
 */

import java.util.Scanner;

public class MediaCenterFines {
	
	public static void main(String[] args) {
		
		// Construct the Scanner Object
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		// Ask the user for their First, Last name and Social Security
		System.out.print("Enter your name (Last, First) and Social Security Number (###-##-###): ");
		String lastName = in.next();
		String firstName = in.next();
		int socialSecurity = in.nextInt();
		System.out.print("\n");
		
		// Ask the user to enter the title of the book
		System.out.print("Enter the name of the book: ");
		String bookName = in.next();
		System.out.print("\n");
		
		// Ask the user to enter the date when the book was checked out
		System.out.print("Enter the date when the book was checked out (mm/dd/yy): ");
		String dateCheckOut = in.next();
		System.out.print("\n");
		
		System.out.print("Days Late: ");
		int daysLate = in.nextInt();
		System.out.print("\n");
		System.out.print("Daily Fine: ");
		int dailyFine = in.nextInt();
		System.out.print("\n");
		
		// Account Name
		int lastNameLength = lastName.length();
		int halfOfLastName =  lastNameLength / 2;
		int socialSecurityLength = String.valueOf(socialSecurity).length();
		int last4DigitsOfssn = socialSecurityLength % 9;
		
		System.out.println("To: " + lastName + "" + firstName + "								Account: " + firstName + halfOfLastName + "-" + last4DigitsOfssn);
		System.out.println("From: Omar");
		System.out.println("Subject: Overdue Notice");
		System.out.println("===========================================================");
		System.out.println(bookName + " was checked out on: " + dateCheckOut);
		System.out.println("This book is currently " + daysLate + " days late.");
		int totalFine = daysLate * dailyFine;
		System.out.print("Your fine is: " + totalFine);
		
	}

}
