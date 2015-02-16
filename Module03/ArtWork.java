package Module03;

/**
 * Project title: 03.04 ASCII Art
 * 
 * Purpose of Project: This program uses String objects to print an ASCII art message.
 * 
 * @version 11/11/2014
 * 
 * @author Omar Rahman
 * 
 * *********** PMR ***********
 * (+) Learned to use the print() method to create ASCII art.
 * 
 * (-) Formatting took a long time.
 * ***************************
 * 
 * In the future: Format the ASCII art faster.
 */

public class ArtWork
{
    public static void main(String [ ] args)
    {
        //local variables
        String O = " ****   *     *   ***   ****";
        String M = "*    *  * * * *  *   *  *   *";
        String A = "*    *  *  *  *  *****  ****";
        String R = " ****   *     *  *   *  *   *";
        
        //print ASCII art
        System.out.print(O);
        System.out.print("\n");
        System.out.print(M);
        System.out.print("\n");
        System.out.print(A);
        System.out.print("\n");
        System.out.print(R);
    }
} 
