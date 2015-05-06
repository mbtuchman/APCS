package Module03;

/**
 * Project title: 03.06 Text Message Coder
 * 
 * Purpose of Project: Modifies strings.
 * 
 * @version 11/11/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Learned how to modify strings.
 * 
 * (-) Getting the output was a bit difficult.
 * ***************************
 * 
 * In the future: Practice more.
 */

public class TextMessageV1 {
	
	public static void main(String[ ] args) {
		
		// Output 1
		String previousString = "what is life because i dont know";
		System.out.println("String: " + previousString);
		// String Length
		int stringLength = previousString.length();
		System.out.println("Length: " + stringLength);
		// Replace Characters
		String replaceCharacters = previousString.replace("what", "wut");
		replaceCharacters = replaceCharacters.replace("i dont know", "idk");
		System.out.println("Replace: " + replaceCharacters);
		// Split String
		int meetMeHalfWay = stringLength / 2;
		String firstPart = previousString.substring(0, meetMeHalfWay);
		String secondPart = previousString.substring(meetMeHalfWay, stringLength);
		String split = secondPart + "-" + firstPart; 
		System.out.println("Split String:: " + split);
		// Sub String
		System.out.print("Sub String: ");
		System.out.println(previousString.substring(5, 8));
		// Remove Vowels
		String noVowels = previousString.replaceAll("[aeiou]", "");
		System.out.println("Replace All: " + noVowels);
		// Remove Consonants
		String noConsonants = previousString.replaceAll("[whtslf]", "");
		System.out.println("Replace All: " + noConsonants);
		// IndexOf
		System.out.print("Index Of: ");
		System.out.println(previousString.indexOf('w'));
		System.out.print("Index Of: ");
		System.out.println(previousString.indexOf('w', '5'));
        // Replace
        System.out.print("Replace: ");
        System.out.println(previousString.replace(previousString, "you just got replaced"));
	}

}
