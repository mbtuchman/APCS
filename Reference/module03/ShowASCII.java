package Reference.module03;

/**
 * This program prints the ASCII characters that correspond to ASCII values, and
 * prints the ASCII values that correspond to specific ASCII characters.
 * 
 * Notice that (int) is used to cast a character literal to its corresponding ASCII value, and
 * that (char) is used to cast an ASCII value to its corresponding character literal.
 * 
 * ©FLVS 2007
 * @author B. Jordan
 * @version 01/19/07
 */

public class ShowASCII
{
    public static void main(String[ ] args)
    {   
        //cast a character literal to its integer ASCII value
        System.out.println("The ASCII code for " + 'A' + " is " + (int)'A');
        System.out.println("The ASCII code for " + '9' + " is " + (int)'9');
        System.out.println();
        
        //cast an integer ASCII value to its corresponding character literal
        System.out.println("93 is the ASCII code for " + (char)93);
        System.out.println("173 is the ASCII code for " + (char)173);
        System.out.println();
        
        //cast a character for the letters in my name (Omar)
        System.out.println("The ASCII code for " + 'O' + " is " + (int)'O');
        System.out.println("The ASCII code for " + 'M' + " is " + (int)'M');
        System.out.println("The ASCII code for " + 'A' + " is " + (int)'A');
        System.out.println("The ASCII code for " + 'R' + " is " + (int)'R');
        System.out.println("Codes together: " + "79776582");
        System.out.println();
        
        //decoding
        System.out.println((char)83);
        System.out.println((char)101);
        System.out.println((char)110);
        System.out.println((char)100);
        System.out.println((char)32);
        System.out.println((char)121);
        System.out.println((char)111);
        System.out.println((char)117);
        System.out.println((char)114);
        System.out.println((char)32);
        System.out.println((char)116);
        System.out.println((char)101);
        System.out.println((char)97);
        System.out.println((char)99);
        System.out.println((char)104);
        System.out.println((char)101);
        System.out.println((char)114);
        System.out.println((char)32);
        System.out.println((char)97);
        System.out.println((char)110);
        System.out.println((char)32);
        System.out.println((char)101);
        System.out.println((char)109);
        System.out.println((char)97);
        System.out.println((char)105);
        System.out.println((char)108);
        System.out.println((char)32);
        System.out.println((char)116);
        System.out.println((char)111);
        System.out.println((char)100);
        System.out.println((char)97);
        System.out.println((char)121);
        
    }//end of main method
}//end of class
