package Assignments;

import java.util.Scanner;

public class BuyingLiquor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int BirtOfDate = scan.nextInt();

        if (BirtOfDate > 21){
            System.out.println("You can buy Liguor");

        }else {
            System.out.println("You cant buy Liguor  try again next year " + (21-BirtOfDate) + " year later");
        }


        System.out.println("****************************");



        int userBirthYear=2011;
        int currentYear=2022;
        int userAge=currentYear-userBirthYear;

        if (userAge >= 21){
            System.out.println("you can buy liquor");

        }else {
            System.out.println("You cant buy liquar now , but you can buy " + (21-userAge) + "years later") ;
        }

        System.out.println("******************************************");
        // Variable for Mark
        double markWeight=78;
        double markHeight=1.69;

        double markBMI=markWeight / (markHeight*markHeight);

        // Variable for John

        double JohnWeight=92;
        double JohnHeight=1.95;

        double JohnBMI= JohnWeight / (JohnHeight*JohnHeight);

        if (markBMI > JohnBMI){
            System.out.println("Mark has higher BMI ");
            System.out.println("markBMI = " + markBMI);
        }else if (JohnBMI > markBMI){
            System.out.println("John has higher BMI");
            System.out.println("markBMI = " + markBMI);
        }else {
            System.out.println("Mark and John have same BMI");
            System.out.println("markBMI = " + markBMI);
            System.out.println("johnBMI = " + JohnBMI);
        }





    }
}
