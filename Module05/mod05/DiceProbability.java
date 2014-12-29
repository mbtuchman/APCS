package Module05.mod05;

import java.util.Random;
import java.util.Scanner;

/**
 * Project title: 05.05 Nested Loops
 * 
 * Purpose of Project: Simulates the probability of a rolled dice with a custom amount of
 * sides and rolls.
 * 
 * @version 12/18/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Understood the for method.
 * 
 * (-) Getting the nested loop was complicated at first.
 * ***************************
 * 
 * In the future: Practice.
 */

public class DiceProbability {
	
    public static void main(String[] args) { 
    	
        Random random; 
        random = new Random(); 

    	// Initialize variables
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in); 
        int die1;
        int die2; 
        int sides; 
        int dieRolls; 
        int sum; 
        int sumOfDie; 
        double numOfRolls; 
        double allMatches = 0; 
        
        //User input
        System.out.print("Enter the amount of sides you would like on the dice: "); 
        sides = in.nextInt(); 
        
        System.out.print("Enter the amount of times you would like to roll the dice: "); 
        dieRolls = in.nextInt(); 
        
        System.out.println("Sum of dice\tProbability\n"); 
        
        //**************************************
        //Using nested loops, cycle through the possible sums of the dice. 
        //Roll the dice the given number of times for each sum. 
        //Count how many times the sum of the dice match the current sum being looked for. 
        //**************************************
        for(sum = 2; sum <= 2 * sides; sum ++) { 
            for(numOfRolls = 0; numOfRolls <= dieRolls; numOfRolls ++) { 
                die1 = random.nextInt(sides) + 1; 
                die2 = random.nextInt(sides) + 1; 
                sumOfDie = die1 + die2; 
                if(sumOfDie == sum) { 
                    allMatches += 1; 
                } 
            } 
            double probability = (allMatches / numOfRolls) * 100; 
            System.out.println(sum + "\t\t" + probability); 
            allMatches = 0; 
        } 
    } 
}
