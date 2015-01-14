package Module06.mod06;

class AnnualClimatev1 {
    
    public static void main(String[] args) {
        
        //Decalre the scanner
        Scanner in = new Scanner(System.in);
        
        //Declare the variables
        String f = "F";
        String c = "C";
        String inches = "Inches";
        String cm = "cm";
        String city = "";
        String state = "";
        
        //Declare the Arrays
        String months [] = {"January",
        "February", "March",
        "April", "May",
        "June", "July",
        "August", "September",
        "November", "December"};
        
        
        //User input
        System.out.println("Choose the temperature scale (F = Fahrenheit, C = Celsius): ");
        String choiceTemp = in.choice;
        System.out.print("Choose the precipitation scale (i = inches, c = centimeteres): ");
        String choiceLength = in.choiceLength;
        
        
        //User output
        System.out.println("Climate Data");
        System.out.println("Location: " + city + ", " + state);
        System.out.println("Month\t" + "Temperature (F)\t" + "Precipitation (inches)");
        System.out.println("********************************************************");
        System.out.println(months + "\n");
    }
    
}