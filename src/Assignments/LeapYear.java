package Assignments;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        int year=1997;

        if (year%4==0 && year%100!=0 || year%400==0){
            System.out.println(year + " is Leap Year");
        }else {
            System.out.println(year + " is not Leap Year");
        }
        System.out.println("**************************");


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the year");
        int year1= scan.nextInt();

        if (year1 %4==0 && year1 %100!=0 || year1%400==0){
            System.out.println(year1 + " is a Leap Year");
        }else {
            System.out.println(year1 + " is not Leap Year");
        }
    }
}
