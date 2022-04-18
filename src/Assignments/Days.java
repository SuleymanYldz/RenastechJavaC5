package Assignments;

import java.util.Scanner;

public class Days {

    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println(" Enter the Number");
        int day=scan.nextInt();
        System.out.println("Day name is " + day);

        String dayName=" ";

        switch (day){
            case 1: dayName="Monday";
            break;
            case 2: dayName="Tuesday";
            break;
            case 3: dayName="Wednesday";
            break;
            case 4: dayName="Thursday";
            break;
            case 5: dayName="Friday";
            break;
            case 6: dayName="Saturday";
            break;
            case 7: dayName="Sunday";
            break;
            default: dayName=" in valid Number entered";
            break;

        }
        System.out.println( " Today is " + dayName );
    }
}
