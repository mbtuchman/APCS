package Module06;

import java.util.Scanner;

/**
 * Created by iberamen on 3/31/15.
 */

public class ExamPart2Question4 {

    public static void main(String[] args) {

        double answer1 = Math.pow(2, 3);
        double answer2 = Math.pow(2.0, 3.0);

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a value for a: ");
        int a = in.nextInt();

        System.out.println("Enter a value for b: ");
        int b = in.nextInt();

        System.out.println("Enter a value for c: ");
        int c = in.nextInt();

        System.out.println("Enter a value for n: ");
        int n = in.nextInt();

        if (n == 2) {
            System.out.println("Fermat was incorrect!");
        }
        else if (Math.pow(a, n) + Math.pow(b, n) != Math.pow(c, n)) {
            System.out.println("Fermat was correct!");
        }

    }

}
