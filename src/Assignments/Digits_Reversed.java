package Assignments;

import java.util.Scanner;

public class Digits_Reversed {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a Number");

        String number= scan.nextLine();
        int lastIndex=number.length()-1;

        String reverse="";
        for (int i =lastIndex; i >=0 ; i--) {
            reverse+=number.charAt(i);
        }
        System.out.println(reverse);
    }
}
