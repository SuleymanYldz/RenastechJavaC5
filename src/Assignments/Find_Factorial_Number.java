package Assignments;

import java.util.Scanner;

public class Find_Factorial_Number {

    public static void main(String[] args) {

        //Create a Java Program to Find Factorial of a Number

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter The Number");
        int number= scan.nextInt();

        int Factorial=1;

        for (int i = 1; i <=number ; i++){
            Factorial= Factorial*i;

        }
        System.out.println(Factorial);

    }
}
