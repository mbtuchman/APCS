package Module06;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Project title: 06.03 The for-each Loop
 *
 * Purpose of Project: Calculates the temp and humidity for Key West Florida.
 *
 * @version 1/18/2015
 *
 * @author Omar Rahman
 *
 * *********** PMR ***********
 * (+) Understood how arrays work better with for-each loops.
 *
 * (-) Printf is still kind of confusing and need a good amount of practice with it and arrays.
 * ***************************
 *
 * In the future: Practice/Review
 */

class HeatIndex {

	public static void main(String[] args) throws IOException {

		String location = "";
		File fileNameTemp = new File("Files/KeyWestTemp.txt");
		File fileNameHumid = new File("Files/KeyWestHumid.txt");

		Scanner inFileTemp = new Scanner(fileNameTemp);
		Scanner inFileHumid = new Scanner(fileNameHumid);

		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int length = months.length;
		double[] temp = new double[length];
		int[] humidity = new int[length];
		double[] hI = new double[length];

		//Input
        //Temperature (Double)
		int n = 0;
		while (inFileTemp.hasNextDouble()) {
			temp[n] = inFileTemp.nextDouble();
			System.out.println(temp[n]);
			n++;
		}
		inFileTemp.close();

        //Humid (Int)
		n = 0;
		while (inFileHumid.hasNextInt()) {
            humidity[n] = inFileHumid.nextInt();
			System.out.println(humidity[n]);
			n++;
		}
		inFileHumid.close();

		//Process (Heat Index Calculations)
		double t = 0.0;
		int h = 0;

		for (n = 0; n < hI.length; n++) {
			if (temp[n] >= 80.0) {
				t = temp[n];
				h = humidity[n];

				hI[n] = -42.379 + 2.04901523 * t;
			}
			else {
				hI[n] = temp[n];
			}
		}

		//Calculate the averages for temperature, humidity and hI
		double tempSum = 0.0;
		int humidSum = 0;
		double hISum = 0.0;

		for (n = 0; n < temp.length; n++) {
			tempSum += temp[n];
		}

		double tempAvg = tempSum / temp.length;

		//Output
		System.out.printf("		Heat Index: %15s \n ", location);
		System.out.println();

		System.out.println("		Months:  ");
		System.out.print("			");
		for (String m : months) {
			System.out.printf("		%3.3s", m);
		}

		System.out.println("  Avg");
		System.out.println("******************************************************************************************");

		System.out.print("Temp (F)	  ");

        for (Double temperature : temp) {
            System.out.printf("     %3.3f", temperature);
        }

		System.out.println();

		System.out.print("Humidity (%)");

        for (Integer humid : humidity) {
            System.out.printf("     %d", humid);
        }

		System.out.println();

		System.out.print("HI (F)	");

        for (Double HI : hI) {
            System.out.printf("     %f", HI);
        }

		System.out.println();

	}

}