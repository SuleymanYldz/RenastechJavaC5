package PracticeGeneral;

public class SwitchPractice2 {

    public static void main(String[] args) {

        int days=78;
        String week;

        switch (days){
            case 1: week= " Mon";
            break;
            case 2: week=" Tue";
            break;
            case 3: week="Wed";
            break;
            case 4: week= "Thur";
            break;
            case 5: week = "Fri";
            break;
            case 6: week =" Sat";
            break;
            case 7: week =" Sun";
            break;
            default: week= " in valid Number";

        }
        System.out.println(week);
    }
}
