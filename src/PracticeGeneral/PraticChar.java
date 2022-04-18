package PracticeGeneral;

import java.util.Scanner;

public class PraticChar {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter three name");
        String name1= scan.nextLine();
        System.out.println("enter second Name");
        String name2= scan.nextLine();
        System.out.println("enter third name");
        String name3= scan.nextLine();

        System.out.println(name1.charAt(7)+"."+ name2.charAt(3)+"."+name3.charAt(5)); // first option
        System.out.println(name1.charAt(name1.length()-1));
        System.out.println(name2.charAt(name2.length()-1));
        System.out.println(name3.charAt(name3.length()-1));
    }
}
