/**
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
        // Sets ASCII Strings (L1 = line 1, L2 = line 2, etc.)
        String L1 = ".##.....##....###....##.....##";
        String L2 = ".###...###...##.##....##...##.";
        String L3 = ".####.####..##...##....##.##..";
        String L4 = ".##.###.##.##.....##....###...";
        String L5 = ".##.....##.#########...##.##..";
        String L6 = ".##.....##.##.....##..##...##.";
        String L7 = ".##.....##.##.....##.##.....##";
        
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
        
    } // method end
} // class end
