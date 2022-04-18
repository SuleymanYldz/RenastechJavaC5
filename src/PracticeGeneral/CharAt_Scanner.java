package PracticeGeneral;

import java.util.Scanner;

public class CharAt_Scanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter First Name ");
        String name= scan.nextLine();

        System.out.println("enter your middle name");
        String MiddleName= scan.nextLine();

        System.out.println("enter your last name");
        String LastName= scan.nextLine();

       if (MiddleName.equals("N/A")|| MiddleName.equals("n/a")){
           System.out.println(name.charAt(0)+"."+ LastName.charAt(0));

       }else {
           System.out.println(name.charAt(0) + "."+ MiddleName.charAt(0)+"."+ LastName.charAt(0));
       }


    }
}
