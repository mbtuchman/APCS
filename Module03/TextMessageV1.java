/**
 * @description 03.06 Text Message Coder
 * 
 * @author Max Tuchman
 * 
 * -=-=-=-=-= PMR =-=-=-=-=-
 * + Learned how to modify strings.
 * 
 * - Generating the correct output was hard.
 * -=-=-=-=-=-=-=-=-=-=-=-=-
 */

public class TextMessageV1 {
	
	public static void main(String[ ] args) {
		
		// Output 1
		String previousString = "why am i such a script kiddie";
		System.out.println("Old Text: " + previousString);
		// String Length
		int stringLength = previousString.length();
		System.out.println("Length: " + stringLength);
		// Replace Characters
		String replaceCharacters = previousString.replace("script kiddie", "skid");
		replaceCharacters = replaceCharacters.replace("why", "y");
		System.out.println("New Text: " + replaceCharacters);
		// Split String
		int meetMeHalfWay = stringLength / 2;
		String firstPart = previousString.substring(0, meetMeHalfWay);
		String secondPart = previousString.substring(meetMeHalfWay, stringLength);
		String split = secondPart + "-" + firstPart; 
		System.out.println("Split String (Half): " + split);
		// Sub String
		System.out.print("Sub String (5, 8): ");
		System.out.println(previousString.substring(5, 8));
		// Remove Vowels
		String noVowels = previousString.replaceAll("[aeiou]", "");
		System.out.println("Remove All Vowels: " + noVowels);
		// Remove Consonants
		String noConsonants = previousString.replaceAll("[bcdfghjklmnpqrstvwxyz]", "");
		System.out.println("Remove All Consonants: " + noConsonants);
		// IndexOf
		System.out.print("Index Of: ");
		System.out.println(previousString.indexOf('w'));
		System.out.print("Index Of: ");
		System.out.println(previousString.indexOf('w', '5'));
	}

}
