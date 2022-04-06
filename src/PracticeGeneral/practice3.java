package PracticeGeneral;

import java.util.Scanner;

public class practice3 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);



        int number1, number2, number3;
        System.out.println("enter first number");
        number1= scan.nextInt();
        System.out.println("enter second number");
        number2= scan.nextInt();
        System.out.println("enter third number");
        number3=scan.nextInt();

        if (number1 > number2){
            if (number1 > number3){
                System.out.println("biggest number is " + number1);
            }else {
                System.out.println("biggest number is  " + number3);
            }

        }else {
            if (number2 > number3){
                System.out.println("Biggest number is " + number2);
            }else {
                System.out.println("Biggest number is " + number3);
            }
        }

    }
}
