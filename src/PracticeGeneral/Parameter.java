package PracticeGeneral;

public class Parameter {

    public static void main(String[] args) {
        System.out.println(SleepIn(false,true));
        System.out.println(SleepIn(true,false));
        System.out.println(SleepIn(false,true));

    }

    public static boolean SleepIn(boolean day, boolean vacation) {

        boolean result = true;

        if (day == false && vacation == false) {
            result = true;
        } else if (day == true && vacation == false) {
            result = false;
        } else if (day == false && vacation == true) {
            result = true;
        }
        return result;

    }
}
