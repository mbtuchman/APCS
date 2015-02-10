package Module08.mod08;

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

public class CO2FootprintV1 {

    public double myGallonsUsed, myTonsC02, myPoundsC02;

    /*
    Constructor for C02FootPrint.
    @param gals = gallons used
     */
    CO2FootprintV1(double gals) {
        myGallonsUsed = gals;
    }

    /*
    Method to get Pounds of C02
    @return double of the myPoundsC02
     */
    public double getPoundsC02() {
        return myPoundsC02;
    }

    /*
    Method to get Tons of C02
    @return double of myTonsC02;
     */
    public double getTonsC02() {
        return myTonsC02;
    }

    /*
    Method to calculate tons of C02 emitted
    @return myTonsC02 multiplied by the gallons used and the formula to calculate
     */
    public void calcTonsC02() {
        myTonsC02 = myGallonsUsed * (8.78 * Math.pow(10, -3));
    }

    /*
    Method to convert Tons to Pounds
    @return double myPoundsC02 is equal to Tons multiplied by 2204.6 (Amount of pounds in a ton)
     */
    public void convertTonsToPoundsC02() {
        myPoundsC02 = (myTonsC02 * 2204.6);
    }

}
