package Module10;

/**
 * @author Omar Rahman
 * @version 5/4/2015
 */

public class ExamPart2Question2 {

    private double radius;

    public ExamPart2Question2(double rad) {
        radius = rad;
    }

    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

}
