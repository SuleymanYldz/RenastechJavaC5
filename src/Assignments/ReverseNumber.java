package Assignments;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
        int number= scan.nextInt();

        int reverse=0;
        int remain=0;
        while (number!=0){

            remain=number%10;
            number=number/10;
            reverse=reverse*10+remain;
        }
        System.out.println(reverse);

        System.out.println("-----------------------------------");

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number  ");
        int num=input.nextInt();

        int rev=0;
        int remainder=0;
        while (num!=0){

            remainder=num%10;
            num=num/10;
            rev=rev*10+remainder;

        }
        System.out.println(rev);
        System.out.println("*********************************");

        Scanner scan2=new Scanner(System.in);
        System.out.println("enter Number");

       String number2= scan2.nextLine();
        int lastIndex=number2.length()-1;

        String reverseNumber= " ";
        for (int i = lastIndex; i >=0 ; i--) {
            reverseNumber+=number2.charAt(i);
        }
        System.out.println(reverseNumber);
    }
}
