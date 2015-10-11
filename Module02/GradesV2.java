/**
 * @author Max Tuchman (me@mbtuchman.com)
 * @description 02.07 Pitfalls, Surprises, and Shortcuts
 * 
 * -=-=-=-= Begin PMR (Post Mortem Review) =-=-=-=-
 * Pluses:
 * + I learned how to use static memory in a better way.
 * 
 * Minuses:
 * - I made way to many spelling errors. (I need to make a spell-checker for my code)
 * -=-=-=-= End PMR (Post Mortem Review) =-=-=-=-
 */

public class GradesV2
{
    public static void main(String[ ] args)
    {
    	/**
    	 * Declared Variables. (Local Variables)
    	 */
        //local variables
        int numTests = 0; //counts number of tests
        int testGrade = 0; //individual test grade
        int totalPoints = 0; //total points for all tests
        double average = 0.0; //average grade
               
    	// First score
        testGrade = 98;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Grade:" + " " + testGrade);
        System.out.print("   Total:" + " " + totalPoints);
        System.out.println("   Average:" + " " + average);
        
        // Second score
        testGrade = 90;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Grade:" + " " + testGrade);
        System.out.print("   Total:" + " " + totalPoints);
        System.out.println("   Average:" + " " + average);
        
        // Third score
        testGrade = 92;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Grade:" + " " + testGrade);
        System.out.print("   Total:" + " " + totalPoints);
        System.out.println("   Average:" + " " + average);
        
        // Fourth score
        testGrade = 95;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Grade:" + " " + testGrade);
        System.out.print("   Total:" + " " + totalPoints);
        System.out.println("   Average:" + " " + average);
               
    } // main method end
} // class end
