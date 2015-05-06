package Module02;


/**
 * Project title: 02.08 Challenge Program
 * 
 * Purpose of Project: The CurrencyConversion class converts an amount of money from a specific
 * country into the equivalent currency of another country given the current
 * exchange rate.
 *
 * @version 11/3/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Learned how to exchange rates using current rates at the time.
 * 
 * (-) Had some trouble not using multiplication and subtraction but found work-arounds.
 * ***************************
 * 
 * In the future: Learn how to cast better.
 * 
 * Site used for exchange rates: http://xe.com/
 */

public class CurrencyConversionV1
{
    public static void main(String [ ] args)
    {
        double startingUSDollars = 5000.00;		// local variable for US Dollars.
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent.
        double pesoExchangeRate = 13.5011;    // local variable for exchange rate of US Dollars to Pesos.
        double yensSpent = 99939.75;		// local variable for Yens spent.
        double yenExchangeRate = 113.655;	  // local variable for exchange rate of US Dollars to Yen.
        double eurosSpent = 624.95;			// local variable for Euros spent in Europe.
        double euroExchangeRate =  1.24965;	// local variable for exchange rate of US Dollars to Euros.
        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;      // local variable for dollars spent in Mexico.
        double dollarsSpentInJapan = yensSpent / yenExchangeRate;	// local variable for dollars spent in Japan.
        double dollarsSpentInEurope = eurosSpent / euroExchangeRate;		// local variable for dollars spent in Europe.
        double remainingUsDollars = startingUSDollars - dollarsSpentInMexico - dollarsSpentInJapan - dollarsSpentInEurope;        // local variable for US Dollars remaining.

        // purpose of program
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // convertion for Mexican pesos
        System.out.println("Starting US Dollars:   " + startingUSDollars);
        System.out.println("US dollars spent in Mexico:   " + dollarsSpentInMexico);

        // convertion for Japanese yen
        System.out.println("US dollars spent in Japan:   " + dollarsSpentInJapan);

        // convertion for Euros
        System.out.println("US dollars spent in Europe:   " + dollarsSpentInEurope);


        //print output to the screen
        System.out.println("Remaining US Dollars:   " + remainingUsDollars);


        // Complete the code below. Replace th 0's for totalItem and fundsRemaining
        // with the proper calculations. Casting, integer division and the modulus
        // operator needed. Do not worry about extra decimal places for the dollar amounts.

 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 4;  						//cost per item of first souvenir
		int budget1 = 50;   						//budget for first item
		int totalItem1 = budget1 / costItem1; 		//how many items can be purchased
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
		double fundsRemaining2 = budget2 % totalItem2;  	//how much of the budget is left // I am not sure why the output is 33.

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItem2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class
