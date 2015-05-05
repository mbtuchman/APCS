package Module10;

import java.util.ArrayList;

/**
 * @author Omar Rahman
 * @version 5/5/2015
 */

public class RectangleStatsTester {

    public static void main(String[] args)
    {
        ArrayList<Integer> intLength = new ArrayList<Integer>();
        intLength.add(7);
        intLength.add(5);
        int [ ] intWidth = {3, 4};

        RectangleStats rectStats = new RectangleStats(intLength, intWidth);
        rectStats.calcRectanglePerimeter();
        rectStats.printArea();
    }

}
