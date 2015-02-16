package Module08;

/**
 * Project title: 08.12 Challenge Program
 *
 * Purpose of Project: Calculate the C02 output by the number of gas used.
 *
 * @version 2/16/2015
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

public class CO2Footprint {
    
    private int numBulbs, numPeople;
    private double pricePerKWH;
    private double monthlyBill;
    private double grossWasteEmission, netWasteEmission, wasteReduction;
    private double myGallonsUsed;
    private boolean recyclePaper, recyclePlastic, recycleGlass, recycleCans;

    public CO2Footprint(double gallons, double kwh, double bill, int people, boolean paper, boolean plastic, boolean glass, boolean cans, int bulb) {
        myGallonsUsed = gallons;
        pricePerKWH = kwh;
        monthlyBill = bill;
        numPeople = people;
        recyclePaper = paper;
        recyclePlastic = plastic;
        recycleGlass = glass;
        recycleCans = cans;
        numBulbs = bulb;
    }

    public double calcBulbReduction() {
        return ((double) numBulbs * 1.37 * 73);
    }

    public double getGallonUsed() {
        return myGallonsUsed;
    }

    public double calcPoundsCO2FromGas() {
        return myGallonsUsed * 8.78E-3 * 2000;
    }

    double calcElectricityCO2() {
        return monthlyBill / pricePerKWH * 1.37 * 12;
    }

    public boolean getRecyclingPaper() {
        return recyclePaper;
    }

    public boolean getRecyclingPlastic() {
        return recyclePlastic;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public boolean getRecyclingCans() {
        return recycleCans;
    }

    public boolean getRecyclingGlass() {
        return recycleGlass;
    }

    public double calcGrossWasteEmission() {
        return (numPeople * 1018);
    }

    public double calcWasteReduction() {
        wasteReduction = 0;

        if(recyclePaper) {
            wasteReduction += (numPeople * 184);
        }
        else if(recyclePlastic) {
            wasteReduction += (numPeople * 25.6);
        }
        else if(recycleGlass) {
            wasteReduction += (numPeople * 46.6);
        }
        else if(recycleCans) {
            wasteReduction += (numPeople * 165.8);
        }
        return wasteReduction;
    }

    public double calcNetWasteEmission(){
        calcGrossWasteEmission();
        calcWasteReduction();
        return netWasteEmission = calcGrossWasteEmission() + calcPoundsCO2FromGas() + calcElectricityCO2() - calcWasteReduction() - calcBulbReduction();
    }

    public double getGrossWasteEmission() {
        return grossWasteEmission;
    }

    public double getWasteReduction() {
        return wasteReduction;
    }

    public double getNetWasteEmission() {
        return netWasteEmission;
    }

}
