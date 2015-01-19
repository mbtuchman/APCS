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

        double[] numberList = {1.0, 0.90, 0.80, 0.70, 0.60, 0.50, 0.40, 0.30, 0.20, 0.10, 0.00, -0.10, -0.20, -0.30, -0.40, -0.50, -0.60, -0.70,-0.80, -0.90, -1.00};
        double radius = 1.0;

        //Output
        System.out.println("     Points on a Circle of Radius 1.0");
        System.out.println("     x1     y1    x2     y2");
        System.out.println("---------------------------------------------");

        for (int z = 0; z < numberList.length; z++) {
            double y1 = Math.sqrt(Math.pow(radius, 2) - Math.pow(numberList[z], 2));
            double y2 = 0.00;

            if (y1 != 0.00)
            {
                y2 = (-y1);
            }
            System.out.printf("%10.2f%10.2f%10.2f%10.2f%n", numberList[z], y1, numberList[z], y2);
        }

    }
}
