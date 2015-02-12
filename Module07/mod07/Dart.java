package Module07.mod07;

/**
 * Project title: 07.06 Challenge Program
 *
 * Purpose of Project: Calculates the value of PI by simulating a dart being thrown on a board.
 *
 * @version 2/12/2015
 *
 * @author Omar Rahman
 *
 * *********** PMR ***********
 * (+) Understood for loops better and OOP.
 *
 * (-) Practice printf.
 * ***************************
 *
 * In the future: Practice.
 */

import java.util.Scanner;

public class Dart {

    /* Public static variables */

    public static Scanner in = new Scanner(System.in);

    public static double x = (2 * Math.random() - 1);
    public static double y = (2 * Math.random() - 1);
    public static double radius = 1.0;
    public static double numX, numY, numHits, pi, avg, total;
    public static int numThrows, trails;

    /*
    Public static int method
    @return Calculates the hits of the dart
     */
    public static int hits(double x, double y, int trails) {
        numHits = 0;

        for (int i = 1; i < trails; i++) {
            x = (2 * Math.random() - 1);
            y = (2 * Math.random() - 1);

            if ((Math.pow(x, 2) + Math.pow(y, 2)) <= (Math.pow(radius, 2))) {
                numHits++;
            }
        }
        return (int) numHits;
    }

    /*
    Public static double method
    @return Calculates PI
     */
    public static double calcPi(double numHits, double numThrows) {
        return (4 * (numHits) / numThrows);
    }

    /*
    Public Main static method
    @return Output
     */
    public static void main(String[] args) {
        System.out.println("How many times should the dart be thrown per trial?");
        numThrows = in.nextInt();

        System.out.print("\n");

        System.out.println("How many trials do you want to simulate?");
        trails = in.nextInt();

        System.out.print("\n");

        for (int i = 0; i < trails; i++) {
            int hits = hits(x,y,numThrows);
            double estimatedPi = calcPi(hits,numThrows);
            total += estimatedPi;
            System.out.printf("Trial " + (i + 1) + ": pi = %12f\n", estimatedPi);
        }
        double averagePi = (total / trails);

        System.out.printf("Average Calculation of Pi: %1.5f", averagePi);
    }

}