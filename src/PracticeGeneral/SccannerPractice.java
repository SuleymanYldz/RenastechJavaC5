package PracticeGeneral;

import java.util.Scanner;

public class SccannerPractice {

    public static void main(String[] args) {

        // Find Biggest Number

        Scanner scan=new Scanner(System.in);

        int Number1 , Number2, Number3;




        System.out.println("Please enter  first number");
        Number1= scan.nextInt();
        System.out.println("Please enter second number");
        Number2= scan.nextInt();
        System.out.println("Please enter third number");
        Number3= scan.nextInt();


        if (Number1 > Number2){
            if (Number1 >  Number3)
                System.out.println("Biggest Number is " + Number1);

        }else {
            if (Number2 > Number1) {
                if (Number2 >Number3)
                    System.out.println("Biggest Number is " + Number3);
            }else {
                System.out.println("Biggest Number is " + Number3);

        }
        }



    }
}
