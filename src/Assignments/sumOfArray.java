package Assignments;

import java.util.Scanner;

public class sumOfArray {

    //Question 3
//
//Write a program that creates an array of 10 elements size.
// Your program should prompt the user to input numbers in array and then display the sum of all array elements.,80,

    public static void main(String[] args) {

        int [] numbers=new int[10];
        int sum=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter Numbers");
        for (int i = 0; i <numbers.length ; i++) {

            int result= scan.nextInt();
            sum=sum+result;


        }
        System.out.println(sum);

        System.out.println("----------------------------------------");

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter 10 numbers");

        int [] number=new int[ 15];

        int sums=0;

        for (int i = 0; i <=number.length-1 ; i++) {

            int rest=input.nextInt();
            sums=sum+number[i];


        }
        System.out.println(sums);
        System.out.println("**************************************");




    }
}
