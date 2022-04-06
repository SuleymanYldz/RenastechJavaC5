package Assignments;

import java.util.Scanner;

public class DisplayPrimeNumnersbetweenTwoIntervals {

    public static void main(String[] args) {

        int number1 = 6;

        int number2=98;

        for (int i = number1; i <number2 ; i++) {
            if (i%2!=0 && i%3!=0){
                System.out.println("prime numbers are " + i);
            }

        }
    }
}
