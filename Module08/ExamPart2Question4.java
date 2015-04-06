package Module08;

/**
 * @author Omar Rahman
 * @version 4/6/2015
 */

public class ExamPart2Question4 {

    public static boolean isLeapYear(int year) {

        if ((year % 4 == 0) && year % 100 != 0) {
            return true;
        }
        else if (year % 400 == 0) {
            return true;
        }
        else {
            return false;
        }

    }

}
