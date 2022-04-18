package PracticeGeneral;

import java.util.Scanner;

public class practiceScanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("insert your byte number");
        byte b1= scan.nextByte();
        System.out.println(b1);

        System.out.println("--------------------------");

        System.out.println("enter int number");
        int number= scan.nextInt();
        System.out.println("integer number " + number);

        Scanner input=new Scanner(System.in);
        System.out.println("enter short number");
        short number2=input.nextShort();
        System.out.println("short number is : " + number2);

    }
}
