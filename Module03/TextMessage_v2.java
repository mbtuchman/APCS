import java.util.Scanner;
/**
 * @description 03.07 Accepting User Input
 * @author Max Tuchman (me@mbtuchman.com)
 *
 * -=-=-=-=-= PMR =-=-=-=-=-
 * Pluses:
 * + Added user Input
 *
 * Minuses:
 * - Using commas in a split makes a "-" appear in output.
 * -=-=-=-=-=-=-=-=-=-=-=-=-
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
		System.out.println("All Consonants: " + noVowels);
		// Remove Consonants
		String noConsonants = previousString.replaceAll("[qwrtypsdfghjklzxcvbnm]", "");
		System.out.println("All Vowels: " + noConsonants);
	}

}
