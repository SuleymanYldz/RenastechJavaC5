package Assignments;

import java.util.Scanner;

public class OddAndEven {

    //Question 1
//Even or Odd
//Write a program that asks the user to enter a number and displays whether entered number is an odd number or even number

    public static void main(String[] args) {

        System.out.println("Please enter the number ");
        Scanner scan=new Scanner(System.in);

        int number= scan.nextInt();
        if (number % 2 == 0){
            System.out.println( number + " is even number ");

        }else{
            System.out.println( number + " is odd number");


            System.out.println("**************************");



            Scanner console=new Scanner(System.in);
            System.out.println(" Get a number from user");

            number = console.nextInt();
            if (number % 2 ==0 )
                System.out.println("number is even");
            else {
                System.out.println("number is odd ");
            }



        }



    }
}
