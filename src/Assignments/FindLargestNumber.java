package Assignments;

import java.util.Scanner;

public class FindLargestNumber {

    public static void main(String[] args) {

       //Create a Java Program to Find the Largest Among Three Numbers

        Scanner scan= new Scanner(System.in);

        System.out.println("Please enter First Number");
        int number1= scan.nextInt();
        System.out.println("Please enter Second Number");
        int number2= scan.nextInt();
        System.out.println("Please enter Third Number");
        int number3= scan.nextInt();

        if (number1 > number3 && number1 > number2){
            System.out.println("Biggest Number is " + number1);

        }else if (number2 > number1 && number2 > number3){
            System.out.println("Biggest Number is " + number2);
        }else {
            System.out.println("Biggest Number is " + number3);
        }

        System.out.println("*********************");

        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter First number");
        int x= input.nextInt();
        System.out.println("Please enter second Number");
        int y= input.nextInt();
        System.out.println("Please enter Third Number");
        int z= input.nextInt();

        if (x > y && x > z){
            System.out.println("Biggest Number is " + x);
        }else if (y > x && y > z){
            System.out.println("Biggest Number is " + y);
        }else {
            System.out.println("Biggest Number is " + z);
        }

    }

}
