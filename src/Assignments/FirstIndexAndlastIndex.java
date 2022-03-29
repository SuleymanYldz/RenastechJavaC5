package Assignments;

import java.util.Scanner;

public class FirstIndexAndlastIndex {

    /*
     // Ask user to enter 3 names by using scanner
// print last index of the names with the names
// Example : Renastech --> Last index is h for Renastech
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please Enter First Name");
        String name1=scan.nextLine();
        System.out.println("last index is "  + name1 + "\t " +  name1.charAt(name1.length()-1));
        System.out.println("Please Enter second name");
        String name2=scan.nextLine();
        System.out.println("Last index is " + name2 + "\t" + name2.charAt(name2.length()-1));
        System.out.println("Please enter third name ");
        String name3=scan.nextLine();
        System.out.println("Last index is " + name3 + "\t" + name3.charAt(name3.length()-1));


        System.out.println("************************************************");


        Scanner input= new Scanner(System.in);


        System.out.println("Please enter first name");
        String user1=input.nextLine();
        System.out.println("last letter of" + user1 + "\t" + user1.charAt(user1.length()-3));
        System.out.println("Please enter second name");
        String user2=input.nextLine();
        System.out.println("last letter of " + user2 + "\t" + user2.charAt(user2.length()-3));
        String user3=input.nextLine();
        System.out.println("Please enter third name ");
        System.out.println("last letter of " + user3 + "\t" + user3.charAt(user3.length()-3));;


    }
}
