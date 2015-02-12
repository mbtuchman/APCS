package Module07.mod07;

/**
 * Project title: 07.01 Javas Math Class
 *
 * Purpose of Project: Calculates the points on a circle of radius 1.0.
 *
 * @version 1/18/2015
 *
 * @author Omar Rahman
 *
 * *********** PMR ***********
 * (+) Got for loops better.
 *
 * (-) Practice printf.
 * ***************************
 *
 * In the future: Practice and use eImacs.
 */

public class PointsOnACircleV1 {

    public static void main(String[] args) {

        //Input
        double radius = 1.0;
        double x = 1.0;
        double y = 1.0;

        //Output
        System.out.println("Points on a Circle of Radius " +radius);
        System.out.println("x1     y1              x2       y2");
        System.out.println("---------------------------------------");
        for(int counter = 0; counter < 20; counter++){
            x-= 0.1;
            double solveY = Math.sqrt((Math.pow(radius, 2) - Math.pow(x, 2)));
            System.out.printf("%5.2f     %5.2f            %5.2f     %5.2f\n" , x, solveY, x, -1 * solveY);
        }
    }
}
