package Module03.mod03;

import java.util.Scanner;

/**
 * Project title: 03.07 Accepting User Input
 * 
 * Purpose of Project: Modifies strings.
 * 
 * @version 11/13/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Learned how to add user input.
 * 
 * (-) Using commas makes the Split String come out with a "-" symbol, but it still works.
 * ***************************
 * 
 * In the future: Try more user input exercises.
 */

public class TextMessageV2 {
	
	@SuppressWarnings("resource")
	public static void main(String[ ] args) {
		
		// contruct the Scanner object.
		Scanner in;
		in = new Scanner(System.in);
		
		// Output 1
		System.out.println("Please enter a sentence:  ");
		String firstWord = in.next();
		String restOfLine = in.nextLine();
		String sentence = firstWord + restOfLine;
		String previousString = sentence;
		System.out.println("String: " + previousString);
		// String Length
		int stringLength = previousString.length();
		System.out.println("Number of Characters: " + stringLength);
		// Replace Characters
		String replaceCharacters = previousString.replace("what", "wut");
		replaceCharacters = replaceCharacters.replace("is", "iz");
		System.out.println("Replaced Characters: " + replaceCharacters);
		// Split String
		int meetMeHalfWay = stringLength / 2;
		String firstPart = previousString.substring(0, meetMeHalfWay);
		String secondPart = previousString.substring(meetMeHalfWay, stringLength);
		String split = secondPart + "-" + firstPart; 
		System.out.println("Split String: " + split);
		// Remove Vowels
		String noVowels = previousString.replaceAll("[aeiou]", "");
		System.out.println("Team Consonants: " + noVowels);
		// Remove Consonants
		String noConsonants = previousString.replaceAll("[qwrtypsdfghjklzxcvbnm]", "");
		System.out.println("Team Vowels: " + noConsonants);
	}

}
