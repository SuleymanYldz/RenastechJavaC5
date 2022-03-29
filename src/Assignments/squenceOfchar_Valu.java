package Assignments;

public class squenceOfchar_Valu {

    /*
     Write a Java program to test if a given string contains the specified sequence of char values.
Sample Output:
Original String: PHP Exercises and Python Exercises
Specified sequence of char values: and
     */


    public static void main(String[] args) {
        String original= "PHP Exercises and Python Exercises ";
        System.out.println(original.contains("PHP"));
        System.out.println(original.contains("Exercises"));
        System.out.println(original.contains("Pythons"));
        System.out.println(original.contains("slm"));
        System.out.println(original.contains("Ex"));
        System.out.println(original.contains("hon"));
        System.out.println(original.contains("love"));
    }
}
