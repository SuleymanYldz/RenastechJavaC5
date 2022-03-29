package Assignments;

import java.util.Scanner;

public class Reverse_Hello {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a word: ");

        String word= scan.nextLine();
        int lastIndex=word.length()-1;

        String reverseword="";

        for (int i =lastIndex; i >=0 ; i--) {
            reverseword+=word.charAt(i);
        }
        System.out.println(reverseword);


        System.out.println("********************************");




    }
}
