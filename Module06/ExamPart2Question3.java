package Module06;

/**
 * Created by iberamen on 3/31/15.
 */

public class ExamPart2Question3 {

    public static void main(String[] args) {

        int[] primeNumbers = new int[]{2, 3, 5, 7, 11};

        int result = 1;
        int sum = 0;

        for(int value : primeNumbers) {
            result *= value;
        }

        System.out.println("The final product of every element multiplied: " + result);

    }

}
