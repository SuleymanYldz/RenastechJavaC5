package PracticeGeneral;

import java.util.Scanner;

public class practiceScanner3 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter first Number");
        short number1= scan.nextShort();
        System.out.println("enter second Number");
        int number2= scan.nextInt();
        System.out.println("enter third number ");
        int number3= scan.nextInt();

        boolean number1Max=number1>number2 && number1>number3;
        boolean number2Max= number2 >number1 && number2>number3;
        boolean number3Max= number3 >number1 && number3> number2;
        int maxNumber=(number1Max) ? number1 : (number2Max) ? number2 : number3;

        System.out.println(maxNumber);
    }
}
