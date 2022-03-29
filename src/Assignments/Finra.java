package Assignments;

import java.util.Scanner;

public class Finra {

    /*
    // Ask the user to enter a number by using the scanner
// If the number is divided by 5 and 3 print FinRa
// If the number is divided by 3 print Fin
//If the number is divided by 5 print RA
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");

        int number=56;
        number= scan.nextInt();
        if (number % 5==0 && number % 3==0){
            System.out.println("FinRa");
        }else if (number % 3==0){
            System.out.println("Fin");
        }else if (number % 5==0){
            System.out.println("Ra");
        }else {
            System.out.println("WRONG NUMBER");
        }

    }
}
