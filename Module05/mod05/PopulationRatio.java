package Module05.mod05;

import java.util.Scanner;

/**
 * Project title: 05.01 while Loops-Part 1
 * 
 * Purpose of Project: A program to simulate the gender population of Uganda.
 * 
 * @version 12/12/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Understood the random() method.
 * 
 * (-) Making it biased to the ratio/percentage took some time.
 * ***************************
 * 
 * In the future: Practice.
 */

public class PopulationRatio {
	
	public static void main(String[] main) {
		int males = 0;
		int females = 0;
		int counter = 1;
		double randNum = 0.0;
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		System.out.println("How many times should this be simulated?");
		int simulate = in.nextInt();
		
		while(counter <= simulate) {
			randNum = Math.random();
			System.out.print(counter + "\t" + randNum);
			
			if (randNum < .4) {
				males++;
				System.out.println("\t males");
			}
			else {
				females++;
				System.out.println("\t females");
			}
			counter++;
		}
		System.out.println();
		System.out.println("Number of Males: " + males);
		System.out.println("Number of Females: " + females);
	}
}
