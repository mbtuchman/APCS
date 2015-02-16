package Module02;


/**
 * Project title: 02.07 Pitfalls, Surprises, and Shortcuts
 * 
 * Purpose of Project: The purpose of this program is to calculate your
 * average based on your test grade and points.
 * 
 * @version 11/1/2014
 * 
 * @author Omar Rahman 
 *
 * *********** PMR ***********
 * (+) How to use memory better.
 * 
 * (-) Getting the right output was time consuming. Made some typos.
 * ***************************
 * 
 * In the future: Create a new habit of efficient memory usage.
 */

public class GradesV2
{
    public static void main(String[ ] args)
    {
    	//local variables 
    	int numTests = 0; //counts number of tests
    	int testGrade = 0; //individual test grade
    	int totalPoints = 0; //total points for all tests
    	double average = 0.0; //average grade
               
    	// Score 1
        testGrade = 98;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        // Score 2
        testGrade = 90;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        // Score 3
        testGrade = 92;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        // Score 4
        testGrade = 95;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests); 
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        // Custom Score 1
        testGrade = 99;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests); 
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        // Custom Score 2
        testGrade = 91;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests); 
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        // Custom Score 3
        testGrade = 93;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests); 
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
        
        // Custom Score 4
        testGrade = 110;
        totalPoints += testGrade;
        numTests++;
        average = totalPoints / (double)numTests;
        System.out.print("n = " + numTests); 
        System.out.print("   New Test Grade: " + testGrade);
        System.out.print("   Total Points: " + totalPoints);
        System.out.println("   Average Score: " + average);
               
    }//end of main method
}//end of class