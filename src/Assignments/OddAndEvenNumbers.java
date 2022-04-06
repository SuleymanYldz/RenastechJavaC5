package Assignments;

import java.util.Scanner;

public class OddAndEvenNumbers {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
    int number=scan.nextInt();

        if (number %2==0){
            System.out.println(number + " is Even Number");
        }else {
            System.out.println(number + " is Odd Number");
        }

        System.out.println("***********************");

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter A number");

        int number1=scan.nextInt();

        if (number1 %2!=0){
            System.out.println(number1 + " is Odd Number");

        }else {
            System.out.println(number1 + " is Even Number");
        }
        System.out.println("********************************");


        Scanner scan2=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan2.nextInt();

        if (num %2==0){
            System.out.println(num + " is Even  Number");
        }else {
            System.out.println(num + " is Odd number");
        }

    }
}
