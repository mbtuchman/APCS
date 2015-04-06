package Module08;

/**
 * @author Omar Rahman
 * @version 4/6/2015
 */

public class CircleStats {

    CircleStats(){}

    public int calcCircleArea(int radius) {
        return (int)(2 * Math.PI * radius);
    }

    public double calcCircleArea(double diameter) {
        return (2 * Math.PI * (diameter/2));
    }

}
