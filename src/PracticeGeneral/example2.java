package PracticeGeneral;

import java.util.Scanner;

public class example2 {

    public static void main(String[] args) {


        int number1, number2, number3;

        Scanner scan=new Scanner(System.in);


        System.out.println("enter first number");
        number1=scan.nextInt();
        System.out.println("enter second number");
        number2=scan.nextInt();
        System.out.println("enter third number");
        number3=scan.nextInt();

        if (number1 <number2 ){
            // num is less than number 2
            if (number1 < number3){
                // num 1 is less than number3
                System.out.println(" minimum number is " + number1);
            }else {
                System.out.println(" minimum number is " + number3);
            }
        }else {
            if (number2 < number3){
                System.out.println(" minimum number is " + number2);
            }
        }


    }

}
