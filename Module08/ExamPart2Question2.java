package Module08;

/**
 * @author Omar Rahman
 * @version 4/6/2015
 */

public class ExamPart2Question2 {

    public static String convertDate(String euroDate) {

        String date = "30-11-2003";
        String values[] = date.split("[-]");
        String usDate = values[1] + "/" + values[0] + "/" + values[2];
        System.out.println(usDate);
        return euroDate.replaceFirst("^(\\d+)-(\\d+)-(\\d+)$","$2-$1-$3");

    }

    public static void main(String[] args) {
        System.out.print(convertDate(""));
    }

}
