/**
 * @description 06.02 Formatting Output
 * @author Max Tuchman (me@mbtuchman.com)
 * 
 * *********** PMR ***********
 * (+) Understood how arrays work.
 * 
 * (-) Need to understand for loops and printf more.
 * ***************************
 */

import java.util.Scanner;

class AnnualClimate {

	public static void main(String[] args) throws IOException{		
       
        //Declare the scanner
        Scanner in = new Scanner(System.in);
        
        //Declare the variables
        String f = "F";
        String c = "C";
        String inches = "Inches";
        String cm = "cm";
        String city = "Miami";
        String state = "Florida";
        String choiceTemp = "";
        String choiceLength = "";
        String tempUnit = "";
        String precipUnit = "";
        
        //Array for the months
        String[] months = {"January","February","March","April","May.","June","July","August","September","October","November","December"};
        
        //Array for temps in Miami, FL
        double[] temp = {68.1, 69.1, 72.4, 75.7, 79.6, 82.4, 83.7, 83.6, 82.4, 78.8, 74.4, 69.9};
        //Array for precip in Miami, FL
        double[] precip = {1.9, 2.1, 2.6, 3.4, 5.5, 8.5, 5.8, 8.6, 8.4, 6.2, 3.4, 2.2};

        //User input
        System.out.println("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        choiceTemp = in.nextLine();
        System.out.print("Choose the precipitation scale (I = Inches, CM = Centimeters): ");
        choiceLength = in.nextLine();
        
        //If user chose F
        if (choiceTemp.equalsIgnoreCase("F")) {
        	tempUnit = "F";
        }
        //If user chose C, convert array data to C
        else if (choiceTemp.equalsIgnoreCase("C")) {
        	for (int i=0; i<12; i++) {
                temp[i] = temp[i]-32;
                temp[i] = (.555)*(temp[i]);
                temp[i] = ((temp[i]*10));
                temp[i] = ((int)temp[i]);
                temp[i] = temp[i]/10;
        	}
        	tempUnit = "C";
        }
        
        //If user chose i
        if (choiceLength.equalsIgnoreCase("i")) {
        	precipUnit = "inches";
        }
        //If user chose cm convert to cm
        else if (choiceLength.equalsIgnoreCase("cm")) {
        	for (int i=1; i<12; i++) {
        		precip[i] = precip[i] * 2.54;
        		precip[i] = precip[i] * 10;
        		precip[i] = ((int)precip[i]);
        		precip[i] = precip[i] / 10;
        	}
        	precipUnit = "cm";
        }
        
        double sum=0.0;
        
        for(int i=0; i<12; i++) 
        {
            sum=sum+temp[i];
        }
        
        //Average Temp
        double avgTemp = sum/12;
        avgTemp = ((avgTemp*10));
        avgTemp = ((int)avgTemp);
        avgTemp = avgTemp/10;
        sum = 0.0;
        
        for(int i=0; i<12; i++) 
        {
            sum=sum+precip[i];
        }
        
        //Average Precip
        double avgPrecip = (sum*10);
        avgPrecip = (int)avgPrecip;
        avgPrecip = avgPrecip/10;
        
        //User output
        System.out.printf("%35s\n", "Climate Data");
        System.out.printf("%45s\n", "Location: " + city + ", " + state);
        System.out.println();
        System.out.printf("%8s%18s%24s\n", "Month", "Temperature " + tempUnit, "Precipitation " + precipUnit);
        System.out.println("*****************************************************");
        
        for(int i=0; i<12; i++) 
        {
            System.out.printf("%8s%13s%20s\n", months[i], temp[i], precip[i]);
        }
        
        System.out.println("*****************************************************");
        System.out.printf("%8s%18s\n", "Average: " + avgTemp , "Annual: " + avgPrecip); 
    }
    
}