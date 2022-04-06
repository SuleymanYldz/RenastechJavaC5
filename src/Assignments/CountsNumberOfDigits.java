package Assignments;

import java.util.Scanner;

public class CountsNumberOfDigits {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number = ");

        int number= scan.nextInt();
        int count=0;


        while (number>=1){
            number/=10;

            count++;
        }
        System.out.println(count);

        System.out.println("***************************");

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number :");
        int number1=input.nextInt();
        int digits=0;

        while (number1>=1){
            number1/=10;
            digits++;
        }
        System.out.println(digits);

        System.out.println("------------------------------------");

        Scanner scan2=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= scan.nextInt();
        int count1=0;

        while (num >=1){
            num/=10;
            count1++;
        }
        System.out.println(count1);



    }
}
