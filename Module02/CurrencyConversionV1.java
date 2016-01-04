/**
 * @author Max Tuchman (me@mbtuchman.com)
 *
 * -=-=-=-= Begin PMR (Post Mortem Review) =-=-=-=-
 * Pluses:
 * + I found out how to make a currency conversion software. (command line based, of course)
 * 
 * Minuses:
 * - It was confusing not to use multiplication or subtraction. More research needed. 
 * 
 * Future research: 
 * <> Find a currency conversion library. 
 * <> Figure out a cleaner way to do currency conversion.
 * -=-=-=-= End PMR (Post Mortem Review) =-=-=-=-
 * 
 */

public class CurrencyConversionV1
{
    public static void main(String [ ] args)
    {
        double startingUSDollars = 5000.00;		// local variable for US Dollars.
        double pesosSpent = 7210.25;            // local variable for Mexican pesos spent.
        double pesoExchangeRate = 16.43;    // local variable for exchange rate of US Dollars to Pesos.
        double yensSpent = 99939.75;		// local variable for Yens spent.
        double yenExchangeRate = 120.18;	  // local variable for exchange rate of US Dollars to Yen.
        double eurosSpent = 624.95;			// local variable for Euros spent in Europe.
        double euroExchangeRate =  0.88;	// local variable for exchange rate of US Dollars to Euros.
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

	// Souvenir #1
	int costItem1 = 4; // Cost (first item)
	int budget1 = 50; // Budget (first item)
	int totalItem1 = budget1 / costItem1; // Number of purchaseable items (first item)
	double fundsRemaining1 = budget1 % totalItem1; // Budget left (first item)

	System.out.println("Item 1:");
	System.out.println("   Cost per item: $" + costItem1);
	System.out.println("   Budget: $"+ budget1);
	System.out.println("   Total items purchased:" + " " + totalItem1);
	System.out.println("   Funds remaining: $"  +  fundsRemaining1);

	// Souvenir #2
	double costItem2 = 32.55; // Cost (second item)
	int budget2 = 713; // Budget (second item)
	int totalItem2 = (int) (budget2 / costItem2); // Number of purchaseable items (second item)
	double fundsRemaining2 = budget2 % totalItem2; // Budget left (second item)

	System.out.println("Item 2:");
	System.out.println("   Cost per item: $" + costItem2);
	System.out.println("   Budget: $"+ budget2);
	System.out.println("   Total items purchased:" + " " + totalItem2);
	System.out.println("   Funds remaining: $"  +  fundsRemaining2);
	
    } // end main method
} // end class
