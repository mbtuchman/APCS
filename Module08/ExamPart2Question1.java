package Module08;

/**
 * @author Omar Rahman
 * @version 4/6/2015
 */

public class ExamPart2Question1 {

    public static boolean isTriangle(int side1, int side2, int side3) {

        int sum = side1 + side2 + side3;

        if (sum > side1 + side2) {
            return false;
        }
        else {
            return true;
        }
    }

}
