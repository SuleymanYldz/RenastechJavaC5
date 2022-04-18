package PracticeGeneral;

public class Switchpractice4 {

    public static void main(String[] args) {


        int  day= 7;
        String weeks;

        switch ( day){
            case 1: weeks = " pazartes";
            break;
            case 2: weeks= "sali";
            break;
            case 3: weeks ="carsamba";
            break;
            case 4: weeks= "persembe";
            break;
            case 5: weeks= "cuma";
            break;
            case 6: weeks =" cumartesi";
            break;
            case 7: weeks = "pazar";
            break;
            default: weeks= "in valid number";


        }
        System.out.println(weeks);
    }
}
