package Assignments;

import java.util.Scanner;

public class Display_MiddleCharacterofString_inUpperCase {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter word");

        String input=scan.nextLine();
        int middleLetter=input.length() /2;

        if (input.length() % 2 ==0){
            System.out.println(input+ "Middle character is = "+ input.substring(middleLetter - 1, middleLetter + 1));
        }else{
            System.out.println( input + "Middle character is = " + input.charAt(middleLetter));
        }


    }
}
