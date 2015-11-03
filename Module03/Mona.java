/**
 * @author Max Tuchman (me@mbtuchman.com)
 * @description 03.09 Challenge Program Beta
 * 
 * -=-=-= PMR =-=-=-
 * Pluses: Learned how to utilize past systems learned in the past to help with this task. 
 * 
 * Minuses: Getting the yield to appear ok took a while.
 * -=-=-=-=-=-=-=-=-
 */

import java.util.Scanner;

public class Mona {
	
	public static void main(String[] args) {
		
		// Calls the scanner object
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		// Ask the user for their First, Last name and Phone Number
		System.out.print("Enter the name (Last, First) and Phone Number (###-###-#### [without dashes]): ");
		String lastName = in.next();
		String firstName = in.next();
		double phoneNumber = in.nextDouble();
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
		double dailyFine = in.nextDouble();
		System.out.print("\n");
		
		// Email Address
		String firstNameFirstLetter = firstName.substring(0,1);
		String lastNameToSecondLetter =  lastName.substring(0, 2);
		String last4DigitsOfPhoneToString = Integer.toString((int) phoneNumber);
		String last4DigitsOfPhone = last4DigitsOfPhoneToString.substring(6,10);
		
		
		System.out.println("To: " + lastName + "" + firstName + "	(" + firstNameFirstLetter.toLowerCase() + lastNameToSecondLetter.toLowerCase() + "" + last4DigitsOfPhone + "@csamediacenter.com)");
		System.out.println("From: Mona (mona@csamediacenter.com)");
		System.out.println("Subject: Overdue Notice");
		System.out.println("===========================================================");
		System.out.println(bookName + " was checked out on: " + dateCheckOut);
		System.out.println("This book is currently " + daysLate + " days late.");
		int totalFine = (int) (daysLate * dailyFine);
		System.out.print("Your fine is: $" + totalFine);
		
	}

}

