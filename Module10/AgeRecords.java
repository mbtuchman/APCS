package Module10;

import java.util.Arrays;

/**
 * @author Omar Rahman
 * @version 5/5/2015
 */

public class AgeRecords {

    private int[] individualAges;
    private String[] ageCategory;

    public AgeRecords(int[] individualAges) {
        this.individualAges = individualAges;
    }

    // postcondition: returns -1.0 if category does not appear in ageCategory

    // otherwise, returns average of all individualAges[n],

    // for all 0 <= n < individualAges.length, such that

    // ageCategory [n] is equal to category

    public double categoryAverage(String category) {
        if (!Arrays.asList(ageCategory).contains("C")) {
            return -1.0;
        }
        else if (!Arrays.asList(ageCategory).contains("T")) {
            return -1.0;
        }
        else if (!Arrays.asList(ageCategory).contains("Y")) {
            return -1.0;
        }
        else if (!Arrays.asList(ageCategory).contains("A")) {
            return -1.0;
        }
        else if (!Arrays.asList(ageCategory).contains("S")) {
            return -1.0;
        }
        else {
            int sum = 0;
            for (int i : individualAges) {
                sum += i;
            }
            double average = 1.0d * sum / individualAges.length;
        }
        return -1.0;
    }

}
