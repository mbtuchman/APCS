package Module06.mod06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Project title: 06.04 Challenge Program
 *
 * Purpose of Project: Challenge program for Hurricane data.
 *
 * @version 2/12/2015
 *
 * @author Omar Rahman
 *
 * *********** PMR ***********
 * (+) Understood while loops more and reading text files.
 *
 * (-) Getting the output with printf() was difficult at first.
 * ***************************
 *
 * In the future: Practice.
 */


public class Hurricanes2 {

    public static void main(String[] args) throws IOException {

        //Declare variables
        int arrayLength = 59;
        int index = 0;
        int windAverage = 0;
        int windMax = 0;
        int pressureAverage = 0;
        int pressureMax = 0;
        int categoryAverage = 0;
        int categoryMax = 0;
        int category1 = 0;
        int category2 = 0;
        int category3 = 0;
        int category4 = 0;
        int category5 = 0;
        //Year Array
        int[] year;
        year = new int[arrayLength];
        //Month Array
        String[] month;
        month = new String[arrayLength];
        //Pressure Array
        int[] pressure;
        pressure = new int[arrayLength];
        //Wind Knots Array
        int[] wind;
        wind = new int[arrayLength];
        //Name Array
        String[] name;
        name = new String[arrayLength];
        //Wind MPH Array
        double[] windMPH;
        windMPH = new double[arrayLength];
        //Category Array
        int[] category;
        category = new int[arrayLength];

        File fileName = new File("Files/hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);

        //Read data from the file
        while (inFile.hasNext()) {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            pressure[index] = inFile.nextInt();
            wind[index] = inFile.nextInt();
            name[index] = inFile.next();
            index++;
        }
        int pressureMin = pressure[0];
        int windMin = wind[0];
        inFile.close();

        //Convert wind speed (Knots to MPH)
        //1 knot(kt) = 1.15077 MPH
        double mphInKnots = 1.5077;
        for (index = 0; index < wind.length; index++) {
            windMPH[index] = wind[index] * mphInKnots;
            windAverage += windMPH[index];

            pressureAverage += pressure[index];

            if (windMPH[index] > 74 && windMPH[index] < 95) {
                category[index] = 1;
                categoryAverage += category[index];
                category1++;
            }
            else if (windMPH[index] > 96 && windMPH[index] < 110) {
                category[index] = 2;
                categoryAverage += category[index];
                category2++;
            }
            else if (windMPH[index] > 111 && windMPH[index] < 129) {
                category[index] = 3;
                categoryAverage += category[index];
                category3++;
            }
            else if (windMPH[index] > 130 && windMPH[index] < 156) {
                category[index] = 4;
                categoryAverage += category[index];
                category4++;
            }
            else if (windMPH[index] > 157) {
                category[index] = 5;
                categoryAverage += category[index];
                category5++;
            }
        }

        int categoryMin = category[0];

        for (index = 0; index < pressure.length; index++) {
            if (pressure[index] < pressureMin) {
                pressureMin = pressure[index];
            }
        }

        for (index = 0; index < pressure.length; index++) {
            if (pressure[index] > pressureMax) {
                pressureMax = pressure[index];
            }
        }

        for (index = 0; index < wind.length; index++) {
            if (wind[index] < windMin) {
                windMin = wind[index];
            }
        }

        for (index = 0; index < wind.length; index++) {
            if (wind[index] > windMax) {
                windMax = wind[index];
            }
        }

        for (index = 0; index < category.length; index++) {
            if (category[index] < categoryMin) {
                categoryMin = category[index];
            }
        }

        for (index = 0; index < category.length; index++) {
            if (category[index] > categoryMax) {
                categoryMax = category[index];
            }
        }

        windAverage = windAverage / windMPH.length;
        categoryAverage = categoryAverage / category.length;
        pressureAverage = pressureAverage / pressure.length;

        //Output
        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");
        for (index = 0; index < year.length; index++) {
            System.out.printf("%d%13s%10d%16d%18d\n" , year[index] , name[index] , category[index] , pressure[index] , (int)windMPH[index]);
        }
        System.out.println("=====================================================================");
        System.out.printf("%s%20d%16d%18d\n" , "Average" , categoryAverage , pressureAverage , windAverage / 2);
        System.out.printf("%s%20d%16d%18d\n" , "Maximum" , categoryMax , pressureMax , windMax);
        System.out.printf("%s%20d%16d%18d\n" , "Minimum" , categoryMin , pressureMin , windMin);
        System.out.println();
        System.out.println("Number of Category 1: " + category1);
        System.out.println("Number of Category 2: " + category2);
        System.out.println("Number of Category 3: " + category3);
        System.out.println("Number of Category 4: " + category4);
        System.out.println("Number of Category 5: " + category5);
    }

}