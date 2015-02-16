package Module04;

import java.util.Scanner;

/**
 * Project title: 04.06 Wellness Menu
 * 
 * Purpose of Project: Testing equals() and menu input.
 * 
 * @version 12/6/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Learned how to create menus.
 * 
 * (-) Formatting took some time.
 * ***************************
 * 
 * In the future: Fill in the menus on the topic.
 */

public class WellnessMenu {
	
	public static void main(String[] args) {
		
		//Construct Scanner
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        
        System.out.println("Please select one of the following options from the menu for more information.");
        System.out.println("\nSelect a letter corresponding to a menu option.");
        System.out.println("[A] BMI");
        System.out.println("[B] BMR");
        System.out.println("[C] Healthy Eating");
        System.out.println("[D] Food Pyrimad");
        System.out.println("[E] Fitness Training");
        System.out.println("Enter A, B, C, D or E");
        String choice = in.next();
        System.out.println();
        
        if(choice.equalsIgnoreCase("A")) //condition for choice A goes in the parentheses
        {
            // provide print statement to indicate menu item A was chosen
            System.out.println("Testing: You chose A for BMI");
        }
        else if(choice.equalsIgnoreCase("B")) //condition for choice B goes in the parentheses
        {
            // provide print statement to indicate menu item B was chosen
        	System.out.println("Testing: You chose B for BMR");
        }
        else if (choice.equalsIgnoreCase("C")) //condition for choice C goes in the parentheses
        {
            // provide print statement to indicate menu item C was chosen
        	System.out.println("Testing: You chose C for Healthy Eating");
        }
        else if (choice.equalsIgnoreCase("D")) //condition for choice D goes in the parentheses
        {
            // provide print statement to indicate menu item D was chosen
        	System.out.println("Testing: You chose D for Food Pyrimad");
        }
        else if (choice.equalsIgnoreCase("E")) //condition for choice E goes in the parentheses
        {
            // provide print statement to indicate menu item E was chosen
        	System.out.println("Testing: You chose E for Fitness Training");
        }
        else //default choice for an invalid entry
        {
            // provide print statement to indicate invalid entry
        	System.out.println("You did not choose a valid menu option!");
        }
	}
}
