package Assignments;

import java.util.Scanner;

public class BuyingLiquor {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int BirtOfDate = scan.nextInt();

        if (BirtOfDate > 21){
            System.out.println("You can buy Liguor");

        }else {
            System.out.println("You cant buy Liguor  try again next year " + (21-BirtOfDate) + "year later");
        }


    }
}
