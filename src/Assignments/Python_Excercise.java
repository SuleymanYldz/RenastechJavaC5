package Assignments;

public class Python_Excercise {

    /*
     Write a Java program to check whether a given string ends with the contents of another string.
Sample Output:
"Python Exercises" ends with "se"? false
"Python Exercise" ends with "se"? true
     */

    public static void main(String[] args) {

        String number1= "Python Exercises";
        String number2= "Python Exercise";

        System.out.println(number1.endsWith("se"));
        System.out.println(number2.endsWith("se"));
    }
}
