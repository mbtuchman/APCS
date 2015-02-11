package Module08.mod08;

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

public class C02FromElectricity {

    double calcAverageBill(ArrayList<Double> monthlyBill) {
        double total = 0;

        for (Double d : monthlyBill) {
            total += d;
        }
        return total / monthlyBill.size();
    }

    double calcAveragePrice(ArrayList<Double> monthlyPrice) {
        double total = 0;

        for (Double d : monthlyPrice) {
            total += d;
        }
        return total / monthlyPrice.size();

    }

    double calcElectricityCO2(double avgBill, double avgPrice) {
        return (avgBill / avgPrice) * 1.37 * 12;
    }

}
