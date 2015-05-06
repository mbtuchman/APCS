package Module05;

import java.util.Random;
import java.util.Scanner;

/**
 * Project title: 05.02 while Loops-Part 2
 * 
 * Purpose of Project: A guessing game where the user guesses a randomly generated number.
 * 
 * @version 12/15/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Understood the random() method with the while method.
 * 
 * (-) Avoiding an infinite loop.
 * ***************************
 * 
 * In the future: Practice.
 */

public class GuessingGameV2 {
	
	public static void main(String[] args) {
		
		//Declare the scanner method
		Scanner in = new Scanner(System.in);
		
		//Declare the variables
		Random random = new Random();
		int tries = 0;
		int guess;
		boolean win = false;
		
		//Ask the user for the range
        System.out.print("Please input the lowest value in your range: ");
        int lowest = in.nextInt();
		System.out.println("Please input the highest value in your range: ");
		int highest = in.nextInt();
		//Generate a random number within the inputed range
		int randomNumber = (int)(Math.random() * (highest - lowest) + lowest);
		
		//While the user didn't win yet
		while (!win) {
			//Prompt user for a guess
			System.out.println("Enter your guess " + lowest + " - " + highest);
			guess = in.nextInt();
			tries++;
			
			if (guess == randomNumber) {
				win = true;
			}
			else if (guess < randomNumber) {
				System.out.println("Too low, try again!");
			}
			else if (guess > randomNumber) {
				System.out.println("Too high, try again!");
			}
		}
		//Output correct number guessed and amount of tries
		System.out.println("You guessed the number after " + tries + " tries!" +  " It was: " + randomNumber);
		
		
	}
}
