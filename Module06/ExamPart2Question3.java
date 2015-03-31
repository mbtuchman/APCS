package Module06;

/**
 * Created by iberamen on 3/31/15.
 */
public class ExamPart2Question3 {

    public static void main(String[] args) {

        int[] primeNumbers = new int[]{2, 3, 5, 7, 11};

        int value;
        int sum = 0;

        for (int primeNumber : primeNumbers) {
            value = primeNumber * primeNumber;
            sum = sum + value;
        }

    }

}
