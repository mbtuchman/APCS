package Module03.mod03;

import java.util.Scanner;

/**
 * Project title: 03.07 Accepting User Input
 * 
 * Purpose of Project: The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 * @version 11/13/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Learned how to exchange rates using current rates with user input.
 * 
 * (-) Had some trouble getting establishing the variables.
 * ***************************
 * 
 * In the future: Learned how to accept user input.
 * 
 * Site used for exchange rates: http://xe.com/
 */

public class CurrencyConversionV2
{
    @SuppressWarnings("resource")
	public static void main(String [ ] args)
    {
    	
    	// create the Scanner object w/ two lines
    	Scanner in;
    	in = new Scanner(System.in);

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        
        double startingUSDollars = 5000.00;		// local variable for US Dollars.
        
        // enter exchange rates
        
        // Peso
        System.out.println("Please enter Peso Exchange Rate:  ");
        double pesoDecimalValue = in.nextDouble();
        System.out.println("You've entered a Peso Exchange Rate of: " + pesoDecimalValue);
        double pesoExchangeRate = pesoDecimalValue;    // local variable for exchange rate of US Dollars to Pesos.
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent.
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;      // local variable for dollars spent in Mexico.
        System.out.println();
        
        // Yen
        System.out.println("Please enter Yen Exchange Rate:  ");
        double yenDecimalValue = in.nextDouble();
        System.out.println("You've entered a Yen Exchange Rate of: " + yenDecimalValue);
        double yenExchangeRate = yenDecimalValue;	  // local variable for exchange rate of US Dollars to Yen.
        double yensSpent = 99939.75;		// local variable for Yens spent.
        double dollarsSpentInJapan = yensSpent / yenExchangeRate;	// local variable for dollars spent in Japan.
        System.out.println();
        
        // Euro
        System.out.println("Please enter Euro Exchange Rate:  ");
        double euroDecimalValue = in.nextDouble();
        System.out.println("You've entered a Euro Exchange Rate of: " + euroDecimalValue);
        double euroExchangeRate = euroDecimalValue; // local variable for exchange rate of US Dollars to Euros.
        double eurosSpent = 624.95;			// local variable for Euros spent in Europe.
        double dollarsSpentInEurope = eurosSpent / euroExchangeRate;		// local variable for dollars spent in Europe.
        System.out.println();
        
        double remainingUsDollars = startingUSDollars - dollarsSpentInMexico - dollarsSpentInJapan - dollarsSpentInEurope;        // local variable for US Dollars remaining.

        // convertion for Mexican pesos
        System.out.println("Starting US Dollars:   " + startingUSDollars);
        System.out.println("US dollars spent in Mexico:   " + dollarsSpentInMexico);

        // convertion for Japanese yen
        System.out.println("US dollars spent in Japan:   " + dollarsSpentInJapan);

        // convertion for Euros
        System.out.println("US dollars spent in Europe:   " + dollarsSpentInEurope);


        //print output to the screen
        System.out.println("Remaining US Dollars:   " + remainingUsDollars);


        // Complete the code below. Replace the 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						//cost per item of first souvenir
		int budget1 = 50;   						//budget for first item
		int totalItem1 = 50 / 4; 		//how many items can be purchased
		double fundsRemaining1 = budget1 % totalItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItem1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);

		//Calculations for Souvenir #2
		double costItem2 = 32.55;  						//cost per item of second souvenir
		int budget2 = 713;   							//budget for second item
		int totalItem2 = (int) (budget2 / costItem2); 	//how many items can be purchased
		double fundsRemaining2 = budget2 / totalItem2;  	//how much of the budget is left // I am not sure why the output is 33.

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
