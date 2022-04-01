package Assignments;

import java.util.Arrays;

public class IndexOfString {

    /*
    Write a Java program to get the character at the given index within the SessionString.
Sample Output:
Original SessionString = Java Exercises!
The character at position 0 is J
The character at position 10 is i
     */

    public static void main(String[] args) {

        String number1= "Java Exercises!";
        System.out.println("The character at position is "+ number1.charAt(0));
        System.out.println("The character at position is "+ number1.charAt(10));
        System.out.println("The character at position is " + number1.charAt(7));
        System.out.println("The character at position is " + number1.charAt(9));
    }
}
