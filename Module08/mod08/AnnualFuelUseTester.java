package Module08.mod08;

/**
 * Project title: 08.08 Arrays of Objects
 *
 * Purpose of Project: Calculate gas used.
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

public class AnnualFuelUseTester {

    public void main(String[] args) {

        int fillUp1 = 1;
        int fillUp2 = 2;
        int fillUp3 = 3;
        int days1 = fillUp1;
        int days2 = 9;
        int days3 = 14;
        int startMiles1 = 108007;
        int endMiles1 = 108199;
        int startMiles2 = endMiles1;
        int endMiles2 = 108302;
        int startMiles3 = endMiles2;
        int endMiles3 = 108497;
        double gallonsUsed1 = 11.7;
        double gallonsUsed2 = 10.5;
        double gallonsUsed3 = 11.4;
        double price1 = 3.09;
        double price2 = 3.17;
        double price3 = 2.99;

        AnnualFuelUse[] years = {
                new AnnualFuelUse(fillUp1, days1, startMiles1, endMiles1, gallonsUsed1, price1),
                new AnnualFuelUse(fillUp2, days2, startMiles2, endMiles2, gallonsUsed2, price2),
                new AnnualFuelUse(fillUp3, days3, startMiles3, endMiles3, gallonsUsed3, price3)
        };

        //Distance

        int maxDistance = Integer.MIN_VALUE;

        for (int i = 0; i < years.length; i++) {
            if (years[i].calcDistance() > maxDistance) {
                maxDistance = years[i].calcDistance();
            }
        }

        int minDistance = Integer.MAX_VALUE;

        for (int i = 0; i < years.length; i++) {
            if (years[i].calcDistance() < minDistance) {
                minDistance = years[i].calcDistance();
            }
        }

        //MPG

        double maxMPG = Double.MAX_VALUE;

        for (int i = 0; i < years.length; i++) {
            if (years[i].calcMPG() < maxMPG) {
                maxMPG = years[i].calcMPG();
            }
        }

        double minMPG = Double.MAX_VALUE;

        for (int i = 0; i < years.length; i++) {
            if (years[i].calcMPG() < minMPG) {
                minMPG = years[i].calcMPG();
            }
        }

        //Price

        double maxPrice = Double.MAX_VALUE;
        for (int i = 0; i < years.length; i++) {
            if (years[i].getPrice() < maxPrice) {
                maxPrice = years[i].getPrice();
            }
        }

        double minPrice = Double.MIN_VALUE;
        for (int i = 0; i < years.length; i++) {
            if (years[i].getPrice() < minPrice) {
                minPrice = years[i].getPrice();
            }
        }

        //Total Distance
        int totalDistance = 0;
        for (int i = 0; i < years.length; i++) {
            totalDistance += years[i].calcDistance();
        }

        //Total Gallons
        int totalGalsUsed = 0;
        for (int i = 0; i < years.length; i++) {
            totalGalsUsed += years[i].getGalsUsed();
        }

        //Total Cost
        double totalCost = 0;
        for (int i = 0; i < years.length; i++) {
            totalCost += years[i].calcCost();
        }

        //Yearly Distance
        int yearlyDistance = 0;
        for (int i = 0; i < years.length; i++) {
            yearlyDistance += (years[i].calcDistance() * 96);
        }

        //Yearly Gallons
        double yearlyGallons = 0;
        for (int i = 0; i < years.length; i++) {
            yearlyGallons += (years[i].calcMPG()) / 2.5;
        }

        //Yearly Cost
        double yearlyCost = 0;
        for (int i = 0; i < years.length; i++) {
            yearlyCost += (years[i].calcCost() * 96);
        }

        System.out.println("Fill Up   Days   Start Miles   End Miles   Distance   " +
                "Gallons Used    MPG      Price    Cost");

        for (int i = 0; i < years.length; i++)
        {
            System.out.printf("%4d %8d %12d %12d %8d %12.2f %12.1f %8.2f %8.2f \n",years[i].getFillup(), years[i].getDays(),
                    years[i].getStartMiles(), years[i].getEndMiles(), years[i].calcDistance(),
                    years[i].getGalsUsed(), years[i].calcMPG(), years[i].getPrice(), years[i].calcCost());

        }
        System.out.println();
        System.out.printf("Minimum:                                     %3d %25.1f %8.2f\n", minDistance, minMPG, minPrice);

        System.out.printf("Maximum:                                     %3d %25.1f %8.2f\n", maxDistance, maxMPG, maxPrice);
        System.out.println();
        System.out.println();
        System.out.printf("Totals:                                      %3d %12.2f %31.2f\n", totalDistance, totalGalsUsed, totalCost);
        System.out.printf("Annual Projection:                           %5d %11.2f %12.2f %17.2f", yearlyDistance, yearlyCost, yearlyGallons, yearlyCost);

    }

}
