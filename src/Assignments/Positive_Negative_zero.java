package Assignments;

import java.util.Scanner;

public class Positive_Negative_zero {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number");
        int number= scanner.nextInt();

        if (number >0)
            System.out.println(number + " is positive number");
        else if (number<0)
            System.out.println(number + " is negative number");
        else
            System.out.println(number + "  is zero");


        System.out.println("****************");

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Please enter user number");
        int number2= scanner.nextInt();

        if (number2==0){
            System.out.println(number2 + " is zero");
        } else if (number2 >0) {

            System.out.println(number2 + " is positive number");

        }else {
            System.out.println(number2 + " is negative number");
        }


    }
}
