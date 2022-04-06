package Assignments;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

     int number=23;

     if (number%2!=0&& number%3!=0){
         System.out.println(number + " is prime number");
     }
     else {
         System.out.println(number + " is not Prime number");
     }
    }

}
