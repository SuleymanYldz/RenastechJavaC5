package Assignments;

import java.util.Scanner;

public class MultiplyTWoFloating_PointNumbers {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter first Number");
        float first=scan.nextFloat();
        System.out.println("Please enter second number");
        float second= scan.nextFloat();

        float Float=first * second;

        System.out.println("Float Point Numbers are  " + Float);

        System.out.println("*****************************");

        Scanner input=new Scanner(System.in);
        System.out.println("Enter First Float Number");
        float number=input.nextFloat();
        System.out.println("Enter Second Float Number");
        float number2=input.nextFloat();

        float FloatNumber= number * number2;
        System.out.println("Multiply Float Number : " + FloatNumber);

    }

}
