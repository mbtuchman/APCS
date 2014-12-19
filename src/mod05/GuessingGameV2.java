package mod05;

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
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		int tries = 0;
		int guess;
		boolean win = false;
		
		while (win == false) {
			System.out.println("Enter your guess (1 - 100):  ");
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
		System.out.println("You guessed the number after " + tries + " tries!" +  " It was: " + randomNumber);
		
		
	}
}
