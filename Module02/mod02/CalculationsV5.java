package mod02;


/**
 * Project title: 02.04 Primitive Data Types
 * 
 * Purpose of Project: The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 * 
 * @version 11/1/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Learned the difference between double, int, print and println.
 * 
 * (-) Formatting took a long time.
 * ***************************
 * 
 * In the future: Take advantage of Eclipse's formatting feature/plugin.
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
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println("16 % 9 equals " + (16 % 9 ));
        System.out.println("5.0 % 3.14 equals " + (5.0 % 3.14 ));
        System.out.println();
        
        // 2.02 Lab Equations
        // 15 divided by 2.5 times -2 plus 10 / 5
        System.out.println("2.02 Lab Equations");
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
