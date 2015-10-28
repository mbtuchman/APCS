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

public class GradesV2 {

	public static void main(String[] args) {
		//local variables
		int numTests = 0;		//counts the number of tests
		int testGrade = 0;		// individual test grade
		int totalPoints = 0;	//total points for all tests
		double average = 0;		//average grade

		/*
		 * Main Operation:
		 * - Adds 1 to the number of tests
		 * - Changes the testGrade variable to the current test grade (97).
		 * - Adds the test grade to the total number of points.
		 * - Calculates the average based on the total points and the number of tests.
		 */
		numTests++;
		testGrade = 97;
		totalPoints += testGrade;
		average = (double)totalPoints / (double)numTests;
		
		//Output: n = numTests	New Test Grade: testGrade	Total Points: totalPoints	Average Score: average
		System.out.print("n = " + numTests + "\t");
		System.out.print("New Test Grade: " + testGrade + "\t");
		System.out.print("Total Points: " + totalPoints + "\t");
		System.out.println("Average Score: " + average);
		
		
		//Same operation with grade: 79
		numTests++;
		testGrade = 79;
		totalPoints += testGrade;
		average = (double)totalPoints / (double)numTests;
		
		//Output: n = numTests	New Test Grade: testGrade	Total Points: totalPoints	Average Score: average
		System.out.print("n = " + numTests + "\t");
		System.out.print("New Test Grade: " + testGrade + "\t");
		System.out.print("Total Points: " + totalPoints + "\t");
		System.out.println("Average Score: " + average);
		
		
		//Same operation with grade: 83
		numTests++;
		testGrade = 83;
		totalPoints += testGrade;
		average = (double)totalPoints / (double)numTests;
		
		//Output: n = numTests	New Test Grade: testGrade	Total Points: totalPoints	Average Score: average
		System.out.print("n = " + numTests + "\t");
		System.out.print("New Test Grade: " + testGrade + "\t");
		System.out.print("Total Points: " + totalPoints + "\t");
		System.out.println("Average Score: " + average);
		
		
		//Same operation with grade: 88
		numTests++;
		testGrade = 88;
		totalPoints += testGrade;
		average = (double)totalPoints / (double)numTests;
				
		//Output: n = numTests	New Test Grade: testGrade	Total Points: totalPoints	Average Score: average
		System.out.print("n = " + numTests + "\t");
		System.out.print("New Test Grade: " + testGrade + "\t");
		System.out.print("Total Points: " + totalPoints + "\t");
		System.out.println("Average Score: " + average);
	}

}
