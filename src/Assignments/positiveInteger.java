package Assignments;

import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class positiveInteger {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");

        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number == 2 || number == 3) {
                System.out.println(number + " is a Prime Number");
                break;
            }
            if (number % i != 0 && number % i != 0) {
                System.out.println(number + " is Prime number");

            }
            else {
                System.out.println(number + " is not Prime Number");
            }
            break;


        }
    }
}

