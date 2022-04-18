package PracticeGeneral;

import java.util.Scanner;

public class PracticeBoolean {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter your Number");
        int number1= scan.nextInt();
        System.out.println("enter your second number");
        int number2= scan.nextInt();
        System.out.println("enter your third number");
        int number3= scan.nextInt();

        boolean number1Max=number1>number3 && number1>number2;
        boolean number2Max= number2> number3 && number2 > number1;
        boolean number3Max= number3 > number1 && number3 > number2;

        int maxNumber=(number1Max) ? number1 : (number2Max) ? number2 : number3;

        System.out.println(maxNumber);
    }
}
