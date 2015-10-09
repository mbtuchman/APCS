/**
 * @author Max Tuchman (me@mbtuchman.com)
 * @description Quick intro to Data Types, double, static, and int.
 * 
 * -=-=-=-= Begin PMR (Post Mortem Review) =-=-=-=-
 * Pluses:
 * + Using variables is sometimes better than writing the variable into a string. (Allows for more versatility)
 * + BlueJ has some features that eclipse does not. But lacks in other fields.
 * 
 * Minuses:
 * - Using variables, which could have been put into a actual string, is counter-productive, unless you are making a statement via that variable.
 * - BlueJ (Not trying to hate, but eclipse is better)
 * -=-=-=-= End PMR (Post Mortem Review) =-=-=-=-
 */

public class CalculationsV5
{
	static int iNum25 = 25;
	static int iNum9 = 9;
	double iNum43 = 43.21;
	double iNum3 = 3.14;
	double iNum5 = 5.0;
	int iNum16 = 16;
	
    public static void main(String[ ] args)
    {
        // Addition
        System.out.println("Addition");
        System.out.print(iNum25 + " plus " + iNum9 + " equals ");
        System.out.println(iNum25 + iNum9);
        System.out.println("43.21 plus 3.14 plus 5.0 equals " + (43.21 + 3.14 + 5.0 ));
        System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println("16 minus 9 minus 25 equals " + (16 - 9 - 25 ));
        System.out.println("3.14 minus 5.0 equals "  + (3.14 - 5.0 ));
        System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println("25 times 9 equals " + (25 * 9 )); 
        System.out.println("3.14 times 5.0 times 5.0 equals " + (3.14 * 5.0 * 5.0 ));
        System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println("9 divided by 25 equals " + (9 / 25 ));
        System.out.println("43.21 divided by 5.0 equals " + (43.21 / 5.0 ));
        System.out.println();
         
        // Modulus
        System.out.println("Modulus");
        System.out.println("16 % 9 equals " + (16 % 9 ));
        System.out.println("5.0 % 3.14 equals " + (5.0 % 3.14 ));
        System.out.println();
        
        // 2.02 Lab Equations
        System.out.println("New Calculations from 2.02 Lab");
        // 15 divided by 2.5 times -2 plus 10 / 5
        System.out.println("15 divided by 2.5 times -2 plus 10 / 5 equals " + (15 / 2.5 * -2 + 10 / 5));
        // 234 minus (234 divided by 6 modulus 12) + 3
        System.out.println("234 minus (234 divided by 6 modulus 12) + 3 equals " + (234 / (234 / 6 % 12) + 3));
        // (46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3)
        System.out.println("(46.2 divided by 11) minus 3 plus 24 modulus (17 minus 2 times 3) equals " + ((46.2 / 11) - 3 + 24 % (17 - 2 * 3)));
        // 480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8
        System.out.println("480 divided by 10 divided by 12 plus 200 *.5 minus 20 modulus 8 equals " + (480 / 10 / 12 + 200 * 0.5 - 20 % 8));
        
        // 2.03 Additional int Equations
        
        
        //2.04 Additional double Equations
        
               
    } // end of main method
} // end of class
