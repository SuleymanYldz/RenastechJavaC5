package Assignments;

import java.util.Scanner;

public class AbsoluteNumber {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number");

        int number= scanner.nextInt();
        System.out.println(" Absolute number is " + Math.abs(number));

        System.out.println("***********************");

        int absolute=-46;

        System.out.println("Absolute number is " + Math.abs(absolute));

        System.out.println("**************************");

        int abs=7888;

        System.out.println("Absolute number is " + Math.abs(abs));
    }
}