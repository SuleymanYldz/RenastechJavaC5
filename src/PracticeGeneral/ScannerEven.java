package PracticeGeneral;

import java.util.Scanner;

public class ScannerEven {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number");

        int number= scan.nextInt();
        if (number %2==0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is a odd number");
        }
        System.out.println("---------------------------------------");


        int number2= scan.nextInt();
        if (number2 %3==0 && number2 %5==0){

            System.out.println(number2 + " odd number");

        }else {
            System.out.println(number2 + " is even number");
        }
    }
}
