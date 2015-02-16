package Module03;

/**
 * Project title: 03.08 Parsing
 * 
 * Purpose of Project: The purpose of this program is to calculate your age in minutes.
 * 
 * @version 11/13/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Learned how to debug.
 * 
 * (-) Had trouble getting the output to come out right.
 * ***************************
 * 
 * In the future: Try to debug more classes and practice Parsing.
 */

import java.util.Scanner;                       
public class AgeCalculatorV2
{
    public static void main(String[] args)
    {       
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        System.out.print("\n");
        
        System.out.print("Please your age in years: ");
        String userAge = in.next();
        int ageInYears = Integer.parseInt(userAge);
        
        double approxAgeInDays = ageInYears * 365.25;
        int ageInHours = (int)approxAgeInDays * 24;
        int ageInMinutes = ageInHours * 60;
        
        String firstInitial = firstName.substring(0,1);
        String capsLastName = lastName.toUpperCase();
        String name = firstInitial  + " . " + capsLastName;
        
        System.out.println("Name: " + name);
        System.out.print("Age in Minutes: " + ageInMinutes + " minutes.");
    }
}
