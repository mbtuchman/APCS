package Module08;

/**
 * Project title: 08.09 Javadocs
 *
 * Purpose of Project: Calculate the C02 output by the number of gas used.
 *
 * @version 2/10/2015
 *
 * @author Omar Rahman
 *
 * *********** PMR ***********
 * (+) Understood OOP more.
 *
 * (-) Need more practice with OOP.
 * ***************************
 *
 * In the future: Practice.
 */

public class CO2FootprintV1Tester {

    public static void main(String[] args) {
        //Declare variables
        double gals, tonsC02, poundsC02;

        gals = 1000.0;

        CO2FootprintV1 footprint = new CO2FootprintV1(gals);

        footprint.calcTonsC02();
        footprint.convertTonsToPoundsC02();
        tonsC02 = footprint.getTonsC02();
        poundsC02 = footprint.getPoundsC02();

        System.out.println("             CO2 Emissions       ");
        System.out.println("Gallons   Pounds      Tons       ");
        System.out.println("of Gas    from Gas   from Gas    ");
        System.out.println("******************************   ");
        System.out.printf("%6.1f    %8.2f    %4.3f",gals, poundsC02, tonsC02);
    }
    
}
