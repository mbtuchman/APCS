package Module06.mod06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Omar Rahman
 * @version 1/18/2015
 */

public class Hurricanes2 {

    public static void main(String[] args) throws IOException {

        //Declare varibles
        int arrayLength = 59;
        int[] year = new int[arrayLength];
        String[] month = new String[arrayLength];

        File fileName = new File("Files/hurcdata2.txt");
        Scanner inFile = new Scanner(fileName);

        //Read data from the file
        int index = 0;
        while (inFile.hasNext()) {
            year[index] = inFile.nextInt();
            month[index] = inFile.next();
            index++;
        }
        inFile.close();

        //Convert wind speed (Knots to MPH)
        //1 knot(kt) = 1.15077 MPH
        

        //Min, max and average for wind speed and pressure

        //Output
        System.out.println("                      Hurricanes 1980 - 2006");
        System.out.println();
        System.out.println("Year     Hurricane    Category     Pressure (mb)     Wind Speed (mph)");
        System.out.println("=====================================================================");

        System.out.println("=====================================================================");

    }

}
