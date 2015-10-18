/**
 * 
 * @author Max Tuchman (me@mbtuchman.com)
 * @description 03.04 ASCII Art
 * 
 * -=-=-=-= PMR =-=-=-=-
 * Pluses:
 * + I figured out how to make ASCII with the print method!
 * + ASCII is really fun!
 * 
 * Minuses:
 * - Formating was a pain in the butt.
 * - Printing the ASCII took a long-ish time. (I'll try to consolidate into a single string in future)
 * -=-=-=-=-=-=-=-=-=-=-
 */

public class ArtWork
{
    public static void main(String [ ] args)
    {
        // Sets ASCII Strings
        String L1 = "          _______  _______";          
        String L2 = "(       )(  ___  )|\     /|";
        String L3 = "| () () || (   ) |( \   / )";
        String L4 = "| || || || (___) | \ (_) / ";
        String L5 = "| |(_)| ||  ___  |  ) _ (";
        String L6 = "| |   | || (   ) | / ( ) \"; 
        String L7 = "| )   ( || )   ( |( /   \ )";
        String L8 = "|/     \||/     \||/     \|";
        
        // Prints actual ASCII
        System.out.print(L1);
        System.out.print("\n");
        System.out.print(L2);
        System.out.print("\n");
        System.out.print(L3);
        System.out.print("\n");
        System.out.print(L4);
        System.out.print("\n");
        System.out.print(L5);
        System.out.print("\n");
        System.out.print(L6);
        System.out.print("\n");
        System.out.print(L7);
        System.out.print("\n");
        System.out.print(L8);
    } // method end
} // class end
