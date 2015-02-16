package Module08;

/**
 * Project title: 08.11 ArrayLists II
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

public class CO2FromWaste {

    private int numberOfPeople;

    private boolean recyclePaper;
    private boolean recyclePlastic;
    private boolean recycleGlass;
    private boolean recycleCans;

    private double grossWasteEmission;
    private double wasteReduction;
    private double netWasteEmission;

    public CO2FromWaste(int ppl, boolean paper, boolean plastic, boolean glass, boolean cans) {

        numberOfPeople = ppl;
        recycleCans = cans;
        recycleGlass = glass;
        recyclePlastic = plastic;
        recyclePaper = paper;

    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public boolean getRecyclingPaper() {
        return recyclePaper;
    }

    public boolean getRecyclingPlastic() {
        return recyclePlastic;
    }

    public boolean getRecyclingGlass() {
        return recycleGlass;
    }

    public boolean getRecyclingCans() {
        return recycleCans;
    }

    public void calcGrossWasteEmission() {
        grossWasteEmission = (numberOfPeople * 1018);
    }

    public void calcWasteReduction() {
        wasteReduction = 0;

        if (recyclePaper) {
            wasteReduction += (numberOfPeople * 184);
        }

        if (recyclePlastic) {
            wasteReduction += (numberOfPeople * 25.6);
        }

        if(recycleGlass){
            wasteReduction += (numberOfPeople * 46.6);
        }
        if(recycleCans){
            wasteReduction += (numberOfPeople * 165.8);
        }
    }

    public void calcNetWasteEmission(){
        calcGrossWasteEmission();
        calcWasteReduction();
        netWasteEmission = grossWasteEmission - wasteReduction;
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
