package Assignments;

import java.util.Scanner;

public class Character_is_Alphabet_or_Not {

    //Create a Java Program to Check Whether a Character is Alphabet or Not
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a Word ");
        char word= scan.next().charAt(0);

        if ((word>='a' && word<= 'z')|| (word >='A' && word <='Z')){
            System.out.println(word + " is an alphabet");

        }else {
            System.out.println(word + " is not alphabet");
        }
    }
}
