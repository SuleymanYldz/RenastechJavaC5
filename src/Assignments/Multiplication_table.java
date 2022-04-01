package Assignments;

import java.util.Scanner;

public class Multiplication_table {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a Number");

        int input=scan.nextInt();
        String multiply="";

        for (int i = 0; i <=10 ; i++) {
            multiply=(input + "*" + i + " = "+(input * i));
            System.out.println(multiply);
        }

        }

    }
