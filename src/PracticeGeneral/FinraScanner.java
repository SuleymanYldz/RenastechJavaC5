package PracticeGeneral;

import java.util.Scanner;

public class FinraScanner {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter Number");
        int number= scan.nextInt();

        if (number %3==0 && number %5==0){
            System.out.println("FinRa");
        }else if (number%3==0){
            System.out.println("Fin");
        }else if (number%5==0){
            System.out.println("RA");
        }else {
            System.out.println("your number is not divided 3 and 5");
        }
    }
}
