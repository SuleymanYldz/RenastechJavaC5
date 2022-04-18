package PracticeGeneral;

import java.util.Scanner;

public class practiceScanner2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("insert first Number: ");
       int number=scan.nextInt();
        System.out.println("you have inserted number : " + number);

        if (number%2==0){
            System.out.println(number + " is even Number");
        }else {
            System.out.println(number + " is  odd Number");
        }
        System.out.println("--------------------------------");

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your number");
        int num= input.nextInt();
        System.out.println("your number is " + num);

        if (num %2==0){
            System.out.println(num + " is even number");
        }else {
            System.out.println(num + " is odd number");
        }
        System.out.println("*****************************");

        Scanner slm=new Scanner(System.in);
        System.out.println("enter the number to check it");
        int numbers= slm.nextInt();
        System.out.println(numbers + " you entered number ");

        if (numbers %2!=0){
            System.out.println(numbers + " is odd number");
        }else {
            System.out.println(numbers + " is even number");
        }

    }
}
