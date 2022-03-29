package Assignments;

import java.util.Scanner;

public class setOfIntegers_and_SumOfEvenAndOddInt {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter  Number");

        int number=scan.nextInt();
        System.out.println("you entered number is= " +number);
        int sum=0;
        int odd=0;

        for (int i = 0; i <=10 ; i++) {
            if (i % 2==0){
                System.out.println("Sum is Even Number " + i);
            }
            for (int j = 0; j <=10 ; j++) {
                if (j % 2 ==0);
                System.out.println("Sum is Odd Number " + j);

            }

        }
    }
}
