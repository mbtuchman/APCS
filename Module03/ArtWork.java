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
        String A = "          _______  _______";          
        String B = "(       )(  ___  )|\     /|";
        String C = "| () () || (   ) |( \   / )";
        String D = "| || || || (___) | \ (_) / ";
        String E = "| |(_)| ||  ___  |  ) _ (";
        String F = "| |   | || (   ) | / ( ) \"; 
        String G = "| )   ( || )   ( |( /   \ )";
        String H = "|/     \||/     \||/     \|";
        
        //print ASCII art
        System.out.print(A);
        System.out.print("\n");
        System.out.print(B);
        System.out.print("\n");
        System.out.print(C);
        System.out.print("\n");
        System.out.print(D);
        System.out.print("\n");
        System.out.print(E);
        System.out.print("\n");
        System.out.print(F);
        System.out.print("\n");
        System.out.print(G);
        System.out.print("\n");
        System.out.print(H);
    }
} 
