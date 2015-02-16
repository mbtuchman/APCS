package Module08;

/**
 * Project title: 08.10 ArrayLists I
 *
 * Purpose of Project: Calculate gas used.
 *
 * @version 2/11/2015
 *
 * @author Omar Rahman
 *
 * *********** PMR ***********
 * (+) Understood OOP more w/ Arrays.
 *
 * (-) Need more practice with OOP.
 * ***************************
 *
 * In the future: Practice.
 */

import java.util.ArrayList;

public class CO2FromElectricityTester {

    public static void main(String[] args) {

        CO2FromElectricity c02Electric = new CO2FromElectricity();

        ArrayList<Double> yearLongBills = new ArrayList();

        yearLongBills.add(120.58);
        yearLongBills.add(119.26);
        yearLongBills.add(130.89);
        yearLongBills.add(142.72);
        yearLongBills.add(135.98);
        yearLongBills.add(123.08);
        yearLongBills.add(132.02);
        yearLongBills.add(138.41);
        yearLongBills.add(90.12);
        yearLongBills.add(112.68);
        yearLongBills.add(118.54);
        yearLongBills.add(122.23);

        double averageBill = c02Electric.calcAverageBill(yearLongBills);

        ArrayList<Double>monthlyCost = new ArrayList();
        monthlyCost.add(0.126120);
        monthlyCost.add(0.126130);
        monthlyCost.add(0.126110);
        monthlyCost.add(0.126140);
        monthlyCost.add(0.126110);
        monthlyCost.add(0.166110);
        monthlyCost.add(0.126810);
        monthlyCost.add(0.136110);
        monthlyCost.add(0.146110);
        monthlyCost.add(0.126160);
        monthlyCost.add(0.136110);
        monthlyCost.add(0.126130);

        double averagePrice = c02Electric.calcAveragePrice(monthlyCost);

        double emissions = c02Electric.calcElectricityCO2(averageBill, averagePrice);

        System.out.printf("Average Monthly Electricity Bill: %3.2f", averageBill);
        System.out.println();
        System.out.printf("Average Monthly Electricity Price: %1.2f", averagePrice);
        System.out.println();
        System.out.printf("Yearly CO2 Emissions from Electricity Usage: %5.1f pounds",emissions);

    }

}
