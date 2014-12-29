package Module05.mod05;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Project title: 05.03 Reading Text Files
 * 
 * Purpose of Project: Calculate the percentage of a repeated string. (Boy, Girl, Both).
 * 
 * @version 12/15/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Understood the IO method.
 * 
 * (-) Reading the file correctly took some time.
 * ***************************
 * 
 * In the future: Practice.
 */

public class Family {
	
	public static void main(String[] args) throws IOException {
		
		double countGG = 0;
		double countBG = 0;
		double countBB = 0;
		File fileName = new File("test1.txt");
		Scanner inFile = new Scanner(fileName);
		while (inFile.hasNextLine()) {
			String token = inFile.next();
			if (token.equalsIgnoreCase("BB")) {
				countBB++;
			}
			else if (token.equalsIgnoreCase("GG")) {
				countGG++;
			}
			else if (token.equalsIgnoreCase("BG")) {
				countBG++;
			}
		}
		inFile.close();
		
		// 75000 is the total amount of lines in the file
		// Would it be possible to make a method for this to be found instantly?
		double bbPercent = countBB / 75000 * 100;
		double ggPercent = countGG / 75000 * 100;
		double bgPercent = countBG / 75000 * 100;
		
		System.out.println("Sample Size:");
		System.out.println("Two Boys: " + bbPercent + "%");
		System.out.println("Two Girls: " + ggPercent + "%");
		System.out.println("One boy, one girl: " + bgPercent + "%");
	}
}