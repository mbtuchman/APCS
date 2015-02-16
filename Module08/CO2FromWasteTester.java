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

import java.util.ArrayList;

public class CO2FromWasteTester {

    public static void main(String[] args) {

        ArrayList<CO2FromWaste> cO2waste = new ArrayList<CO2FromWaste>();

        cO2waste.add(new CO2FromWaste(3, true, false, true, true));
        cO2waste.add(new CO2FromWaste(6, false, true, false, true));
        cO2waste.add(new CO2FromWaste(2, true, true, true, true));
        cO2waste.add(new CO2FromWaste(4, true, true, false, true));
        cO2waste.add(new CO2FromWaste(1, false, false, false, false));

        System.out.println("|       |        |                                 |          Pounds of CO2           |");
        System.out.println("|       |        |    Household Waste Recycled     |  Total   |            |    Net   |");
        System.out.println("| Index | People | Paper | Plastic | Glass |  Cans | Emission |  Reduction | Emission |");

        CO2FromWaste dataRecord;

        for (CO2FromWaste aCO2waste : cO2waste) {
            dataRecord = aCO2waste;
            dataRecord.calcGrossWasteEmission();
            dataRecord.calcWasteReduction();
            dataRecord.calcNetWasteEmission();
        }

        for(int index = 0; index < cO2waste.size(); index++) {
            dataRecord = cO2waste.get(index);
            System.out.printf("%5d %8d %9b %8b %8b" + " %8b %9.2f %10.2f %12.2f\n", index,
                    dataRecord.getNumberOfPeople(), dataRecord.getRecyclingPaper(),
                    dataRecord.getRecyclingPlastic(), dataRecord.getRecyclingGlass(),
                    dataRecord.getRecyclingCans(), dataRecord.getGrossWasteEmission(),
                    dataRecord.getWasteReduction(), dataRecord.getNetWasteEmission());
        }

    }

}
