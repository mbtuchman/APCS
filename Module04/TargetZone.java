package Module04;

/**
 * Project title: 04.03 Target Zone
 * 
 * Purpose of Project: A program to calculate your pulse and check if it is within
 * the best range for max. workout.
 * 
 * @version 12/3/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Learned about if statements.
 * 
 * (-) Getting the if statements to work took some time.
 * ***************************
 * 
 * In the future: Practice.
 */

import java.util.Scanner;
public class TargetZone
{
    public static void main(String[] args)
    {
        //Initialize Scanner and declare variables
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        
        // Explain what the program does
        System.out.println("Determine your target heart rate zone for a cardiovascular exercise (50% - 80%)");
        System.out.print("\n");
        
        //Prompt user for input
        System.out.println("What is your age?  ");
        @SuppressWarnings("unused")
		int age = in.nextInt();
        System.out.println("What is your resting heart rate (RHR)?  ");
        int rhr = in.nextInt();
        System.out.println("What is your heart rate after excercising?  ");
        int hre = in.nextInt();
        System.out.print("\n");
        
        //Calculate heart rate target zone min and max
        double highEnd = (rhr * 0.85) + 70;
        double lowEnd = (rhr * 0.50) + 70;
        System.out.println("High End: " + highEnd + " bpm");
        System.out.println("Low End: " + lowEnd + " bpm");
        System.out.print("\n");
        
        //Determine if heart rate after exercise is between the min and max
        boolean isBetween;
        boolean isNotBetween;
        isNotBetween = hre >= highEnd;
        isBetween = hre <= highEnd;
        if (isBetween == true) {
        	System.out.println("You are between the min and max heart rate after excercise.");
        }
        if (isNotBetween == true) {
        	System.out.println("You are NOT between the min and max heart rate after excercise.");
        }
        System.out.print("\n");

        //Print two output statements
        //The first stating the heart rate target zone
        System.out.println("You should aim between: " + lowEnd + " - " + highEnd);

    } //end main
}//end class TargetZone
