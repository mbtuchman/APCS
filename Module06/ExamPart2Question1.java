package Module06;

import java.util.Arrays;

/**
 * Created by iberamen on 3/31/15.
 */

public class ExamPart2Question1 {

    public static void main(String args[]) {

        double[] phLevels = {5.6, 6.2, 6.0, 5.5, 5.7, 6.1, 7.4, 5.5, 5.5, 6.3, 6.4, 2.1, 6.9};

        double max = phLevels[0];
        double min = phLevels[0];
        String values = Arrays.toString(phLevels);

        double sum = 0.0;
        for (double ph : phLevels) sum += ph;
        double average = 1.0d * sum / phLevels.length;

        //Calculate max
        for (double phLevel : phLevels) {
            if (phLevel > max) {
                max = phLevel;
            }
        }

        //Calculate min
        for (int i = 1; i < phLevels.length;i++){
            if(phLevels[i] < min){
                min = phLevels[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);
        System.out.println("Array Values: " + values);

    }

}
