package Assignments;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three integers as angles and\n" +
                " check whether a triangle is valid or not.");
        int sum =scanner.nextInt();




        int number1 = 110;
        int number2 = 40;
        int number3 = 30;



        int sum1= (number1+number2+number3);
        if (sum==180)
            System.out.println("triangle is valid");
        else
            System.out.println("Triangle is not valid");


        System.out.println("****************");

        int a=80, b= 95, c= 15;
        if ( a + b + c ==180)
            System.out.println(" Triangle is valid");
        else
            System.out.println("Triangle is not valid");

    }
}
