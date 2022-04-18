package PracticeGeneral;

import java.util.Scanner;

public class ScannerNext {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter First name");
      //  String firstName=" Suleyman";
        String firstName= input.next();
        System.out.println("First NAme is : " + firstName);
        System.out.println("enter your last name");

        String lastName=input.next();
        System.out.println(" last name is :" + lastName);

        String fullName=firstName+ " " + lastName;
        System.out.println("Full name is : " + fullName);
        System.out.println("-----------------------------------");


        System.out.println("Grade for student ");

        int grade=input.nextInt();
        System.out.println(fullName + " Grade is " + grade);


    }
}
