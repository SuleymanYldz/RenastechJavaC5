package Assignments;

import java.util.Scanner;

public class Find_Factorial_valueOfNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
         int number=scan.nextInt();
         int actualNumber=number;

        for (int i =1; i <actualNumber; i++) {
            number *= (actualNumber- i);
        }
        System.out.println("Factorial value of " + actualNumber+ " is " + number);
    }
}
