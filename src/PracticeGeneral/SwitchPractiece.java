package PracticeGeneral;

public class SwitchPractiece {

    public static void main(String[] args) {

        int day=5;
        String weekdays;

        switch (day){
            case 1: weekdays =" Monday ";
            break;
            case 2: weekdays="Tuesday";
            break;
            case 3: weekdays=" Wednesday";
            break;
            case 4: weekdays=" Thursday";
            break;
            case 5: weekdays="Friday";
            break;
            case 6: weekdays="Saturday";
            break;
            case 7: weekdays=" Sunday";
            break;
            default: weekdays=" in valid number";


        }
        System.out.println(weekdays);
    }
}
