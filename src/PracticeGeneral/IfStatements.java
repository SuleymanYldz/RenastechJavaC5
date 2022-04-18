package PracticeGeneral;

import java.util.Scanner;

public class IfStatements {

    public static void main(String[] args) {

        int number=-20;

        if (number>10){

            System.out.println("Number is positive");
        }
        System.out.println("outside of if statement");


        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number");

        int num= scan.nextInt();
        if (num%2==0){
            System.out.println(num +"is " + "even number");
        }else {
            System.out.println(num +" is an odd number");
        }



    }
}
