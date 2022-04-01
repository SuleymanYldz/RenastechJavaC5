package Assignments;

import java.util.Scanner;

public class AddTwoIntegers {

    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter First Number");
        int input= scan.nextInt();
        System.out.println("Please Enter second Number");
        int input2= scan.nextInt();

        int sum1= input + input2;
        System.out.println("Sum of both integer is : " + sum1);


    }
}
