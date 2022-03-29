package Assignments;

import java.util.Scanner;

public class FirstNAme_LastName_MiddleName {

    /*
    // Ask user to enter their first name , last name, and middle name
//And print user's initials
// If the user doesn't have a middle name user will enter N/A
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your First Name");
        String name=scan.nextLine();
        System.out.println("Please enter your Middle Name");
        String name2=scan.nextLine();
        System.out.println("Please enter your last name");
        String name3=scan.nextLine();



        if (name3.equals("N/A")|| name3.equals("n/a"))
        System.out.println(name.charAt(0)+ " " + name2.charAt(0));
        else {
            System.out.println(name.charAt(0) + " "+ name2.charAt(0)+ " "+ name3.charAt(0) + "");
        }




    }
}
