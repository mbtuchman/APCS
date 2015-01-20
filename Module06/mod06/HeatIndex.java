package Module06.mod06;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
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

	@SuppressWarnings("unused")
	public static void main (String [ ] args) throws IOException {

		//KeyWestTemp
		double [] temperatures = new double[13];
		File temp = new File("Files/KeyWestTemp.txt"); //Change depends on where the file is stored.
		Scanner inFile = new Scanner(temp);
		int index = 0;

		while (inFile.hasNextDouble())
		{
			temperatures[index] = inFile.nextDouble();
			index++;
		}

		for (double t: temperatures) {}

		inFile.close();

		System.out.println();
		System.out.println();

		//KeyWestHumid
		index = 0;
		double [] humidities = new double[12];
		File humid = new File("Files/KeyWestHumid.txt"); //Change depends on where the file is stored.
		inFile = new Scanner(humid);

		while (inFile.hasNextDouble())
		{
			humidities[index] = inFile.nextDouble();
			index++;
		}

		for (double h: humidities)
		{
		}

		inFile.close();

		int totalHumidity = 0;
		double totalTemp = 0;

		for (int i = 0; i < humidities.length; i++)
		{
			totalHumidity += humidities[i];
		}

		for (int i = 0; i < temperatures.length; i++)
		{
			totalTemp += temperatures[i];
		}
		double averageTemp = totalTemp / 12;
		double averageHumidity = totalHumidity / 12;

		double fourHI = (-42.379) + (2.04901523 * temperatures[4]) + (10.14333127 * humidities[4]) - (0.22475541 * temperatures[4] * humidities[4]) - (6.83783E-3 * temperatures[4] * temperatures[4])  - (5.481717E-2 * humidities[4] * humidities[4])+ (1.22874E-3 * temperatures[4] * temperatures[4] * humidities[4]) + (8.5282E-4 * temperatures[4] * humidities[4] * humidities[4]) - (1.99E-6 * temperatures[4] * temperatures[4] * humidities[4] * humidities[4]);
		double fiveHI = (-42.379) + (2.04901523 * temperatures[5]) + (10.14333127 * humidities[5]) - (0.22475541 * temperatures[5] * humidities[5]) - (6.83783E-3 * temperatures[5] * temperatures[5])  - (5.481717E-2 * humidities[5] * humidities[5])+ (1.22874E-3 * temperatures[5] * temperatures[5] * humidities[5]) + (8.5282E-4 * temperatures[5] * humidities[5] * humidities[5]) - (1.99E-6 * temperatures[5] * temperatures[5] * humidities[5] * humidities[5]);
		double sixHI = (-42.379) + (2.04901523 * temperatures[6]) + (10.14333127 * humidities[6]) - (0.22475541 * temperatures[6] * humidities[6]) - (6.83783E-3 * temperatures[6] * temperatures[6])  - (5.481717E-2 * humidities[6] * humidities[6])+ (1.22874E-3 * temperatures[6] * temperatures[6] * humidities[6]) + (8.5282E-4 * temperatures[6] * humidities[6] * humidities[6]) - (1.99E-6 * temperatures[6] * temperatures[6] * humidities[6] * humidities[6]);
		double sevenHI = (-42.379) + (2.04901523 * temperatures[7]) + (10.14333127 * humidities[7]) - (0.22475541 * temperatures[7] * humidities[7]) - (6.83783E-3 * temperatures[7] * temperatures[7])  - (5.481717E-2 * humidities[7] * humidities[7])+ (1.22874E-3 * temperatures[7] * temperatures[7] * humidities[7]) + (8.5282E-4 * temperatures[7] * humidities[7] * humidities[7]) - (1.99E-6 * temperatures[7] * temperatures[7] * humidities[7] * humidities[7]);
		double eightHI = (-42.379) + (2.04901523 * temperatures[8]) + (10.14333127 * humidities[8]) - (0.22475541 * temperatures[8] * humidities[8]) - (6.83783E-3 * temperatures[8] * temperatures[8])  - (5.481717E-2 * humidities[8] * humidities[8])+ (1.22874E-3 * temperatures[8] * temperatures[8] * humidities[8]) + (8.5282E-4 * temperatures[8] * humidities[8] * humidities[8]) - (1.99E-6 * temperatures[8] * temperatures[8] * humidities[8] * humidities[8]);
		double nineHI = (-42.379) + (2.04901523 * temperatures[9]) + (10.14333127 * humidities[9]) - (0.22475541 * temperatures[9] * humidities[9]) - (6.83783E-3 * temperatures[9] * temperatures[9])  - (5.481717E-2 * humidities[9] * humidities[9])+ (1.22874E-3 * temperatures[9] * temperatures[9] * humidities[9]) + (8.5282E-4 * temperatures[9] * humidities[9] * humidities[9]) - (1.99E-6 * temperatures[9] * temperatures[9] * humidities[9] * humidities[9]);

		double totalHI = temperatures[0] + temperatures[1] + temperatures[2] + temperatures[3] + fourHI + fiveHI + sixHI + sevenHI + eightHI + nineHI + temperatures[10] + temperatures[11];
		double averageHI = totalHI / 12;

		PrintWriter outputFile = new PrintWriter(new File("output.txt"));
		outputFile.println("                                                          Heat Index: Key West, Florida");
		outputFile.println("                                                                     Months");
		outputFile.println("                       Jan     Feb     Mar     Apr     May     Jun     Jul     Aug     Sep     Oct     Nov     Dec     Avg   ");
		outputFile.println("***************************************************************************************************************************");
		outputFile.printf("Temp (F)%18.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f", temperatures[0],temperatures[1],temperatures[2],temperatures[3],temperatures[4],temperatures[5],temperatures[6],temperatures[7],temperatures[8],temperatures[9],temperatures[10],temperatures[11],averageTemp);
		outputFile.println();
		outputFile.printf("Humidity %17.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f", humidities[0],humidities[1],humidities[2],humidities[3],humidities[4],humidities[5],humidities[6],humidities[7],humidities[8],humidities[9],humidities[10],humidities[11],averageHumidity);
		outputFile.println();
		outputFile.printf("HI (F)%20.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f",temperatures[0],temperatures[1],temperatures[2],temperatures[3],fourHI,fiveHI,sixHI,sevenHI,eightHI,nineHI,temperatures[10],temperatures[11],averageHI);
		outputFile.println();
		outputFile.close();

		System.out.println("                                                          Heat Index: Key West, Florida");
		System.out.println();
		System.out.println("                                                                     Months");
		System.out.println("                       Jan     Feb     Mar     Apr     May     Jun     Jul     Aug     Sep     Oct     Nov     Dec     Avg   ");
		System.out.println("***************************************************************************************************************************");
		System.out.printf("Temp (F)%18.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f", temperatures[0],temperatures[1],temperatures[2],temperatures[3],temperatures[4],temperatures[5],temperatures[6],temperatures[7],temperatures[8],temperatures[9],temperatures[10],temperatures[11],averageTemp);
		System.out.println();
		System.out.printf("Humidity %17.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f%8.0f", humidities[0],humidities[1],humidities[2],humidities[3],humidities[4],humidities[5],humidities[6],humidities[7],humidities[8],humidities[9],humidities[10],humidities[11],averageHumidity);
		System.out.println();
		System.out.printf("HI (F)%20.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f%8.1f",temperatures[0],temperatures[1],temperatures[2],temperatures[3],fourHI,fiveHI,sixHI,sevenHI,eightHI,nineHI,temperatures[10],temperatures[11],averageHI);
		System.out.println();

		inFile.close();
	}
}
