package PracticeGeneral;

import java.util.Scanner;

public class SumNumbers {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);


        char choice;
        int number1, number2;

        do {
            System.out.println("Enter First Number");
            number1 =scan.nextInt();
            System.out.println("Enter second Number");
            number2= scan.nextInt();
            int sum=number1+number2;

            System.out.println("Sum of  " + number1 +" + " + number2 + " is : " +sum);
            System.out.println("do you want to sum 2 new number y/n");
            choice=scan.next().charAt(0);

        }while (choice=='y' || choice== 'Y');

    }
}
