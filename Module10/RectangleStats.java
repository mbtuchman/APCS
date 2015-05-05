package Module10;

import java.util.List;

/**
 * @author Omar Rahman
 * @version 5/5/2015
 */

public class RectangleStats {

    private List<Integer> length;

    private int[ ] width;

    double areas[];

    RectangleStats(List<Integer> length, int[] width){
        this.length = length;
        this.width = width;
        this.areas = new double[this.width.length];
    }

    private void calcRectangleArea(){
        for(int i=0; i<width.length; i++){
            areas[i] = length.get(i) * width[i];
        }
    }

    public void printArea(){
        calcRectangleArea();
        for(int i=0; i<areas.length; i++){
            System.out.println("Area " + i + " : " + areas[i]);
        }
    }

    public void calcRectanglePerimeter(){
        for(int i=0; i<width.length; i++){
            System.out.println("Parameter for "+ i +"th Rectangle : " + (2 * (length.get(i) + width[i])));
        }
    }
}
