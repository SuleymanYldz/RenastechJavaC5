package Assignments;

import java.util.Scanner;

public class Starts_Or_Ends {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word");

       String input=scan.nextLine();
        System.out.println("Entered word " + input);

        if (input.startsWith("a") || input.endsWith("A")){
            input=input.substring(1);}
        System.out.println("word "+ input);
        int length=input.length();
        int lastIndex=length -1;
        if (input.substring(lastIndex).equalsIgnoreCase("A")){
            input=input.substring(0, lastIndex);}
        System.out.println("New  word is " + input);
        }
    }

