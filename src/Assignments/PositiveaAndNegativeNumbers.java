package Assignments;

import java.util.Scanner;

public class PositiveaAndNegativeNumbers {

    //Create a Java Program to Check Whether a Number is Positive or Negative

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the Number");
        int number= scan.nextInt();
        if ( number < 0){
            System.out.println(number + " is Negative Number");
        }else {
            System.out.println(number + " is Positive Number");
        }
    }
}
