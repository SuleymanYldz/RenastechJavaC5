package Assignments;

import java.util.Scanner;

public class SumOfNaturelNumbers {

    //Create a Java Program to Calculate the Sum of Natural Numbers

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter number");
        int number= scan.nextInt();
        int sum=0;



        for (int i = 0; i <=number; i++) {

            sum+=i;
        }
        System.out.println("sum is " + sum);
    }
}
