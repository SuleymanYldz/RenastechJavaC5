package Assignments;

import java.util.Scanner;

public class printTogether {

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter first words");
        String word= scan.nextLine();
        System.out.println("Please enter second word");
        String word2= scan.nextLine();

       String newWord= word +word2;
        System.out.println((newWord));


    }
}
