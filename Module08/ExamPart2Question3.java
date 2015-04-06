package Module08;

/**
 * @author Omar Rahman
 * @version 4/6/2015
 */

public class ExamPart2Question3 {

    public static String convertName(String name) {

        String firstName = name.substring(0, name.indexOf(" "));
        String lastName = name.substring(name.indexOf(" "));
        return String.format("%s, %s", lastName, firstName);

    }

    public static void main(String args[]) {
        String name = "Grace Hopper";
        name = convertName(name);
        System.out.println(name);
    }

}
