package Module06.mod06;

import java.io.File;
import java.util.Scanner;

public class HeatIndex {
	
	public static void main(String[] args) {
		
		//Read the text files
		String location = "";
		
		File fileTemp = new File("Files/KeyWestTemp.txt");
		File fileHumid = new File("Files/KeyWestHumid.txt");
		
		Scanner inFileTemp = new Scanner("File/KeyWestTemp.txt");
		Scanner inFileHumid = new Scanner("File/KeyWestHumid.txt");
		
		//Array for months
		String[] months = {"January","February","March","April","May.","June","July","August","September","October","November","December"};
		
		int length = months.length;
		double[] temp = new double[length];
		int[] humidity = new int[length];
		double[] HI = new double[length];
		
		int n = 0;
		while (inFileHumid.hasNextDouble()) {
			humidity[n]	= inFileHumid.nextInt();
			n++;
		}
		inFileHumid.close();
		
		while (inFileTemp.hasNextDouble()) {
			temp[n] = inFileTemp.nextDouble();
			n++;
		}
		inFileTemp.close();
		
		//Heat Index Formula
		
	}

}
