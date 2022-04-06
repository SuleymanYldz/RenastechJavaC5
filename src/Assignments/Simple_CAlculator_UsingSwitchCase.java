package Assignments;

import java.util.Scanner;

public class Simple_CAlculator_UsingSwitchCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = scan.nextInt();
        System.out.println("Enter Second Number");
        int b = scan.nextInt();
        System.out.println("Select operation");
        System.out.println("Additional-a; Subtraction-s: Multiplication-m: Division-d: ");
        char ch=scan.next().charAt(0);

        switch (ch){
            case 'a':
                System.out.println("Sum of the given two numbers : " + ( a + b));
                break;
            case 's':
                System.out.println("Difference between two numbers: " + (a-b));
                break;
            case 'm':
                System.out.println("Product of the two numbers : " + (a*b));
            case 'd':
                    System.out.println("Result of the division: " + (a/b));
                    break;
            default:
                System.out.println("Invalid grade");
        }
    }
}

