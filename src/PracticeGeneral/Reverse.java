package PracticeGeneral;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your word");
        String word= scan.nextLine();

        int lastIndex= word.length()-1;
        String ReverseofWord="";

        for (int i = lastIndex; i >=0 ; i--) {

            ReverseofWord+=word.charAt(i);

        }
        System.out.println(ReverseofWord);

        System.out.println("------------------------------");

        Scanner input=new Scanner(System.in);
        System.out.println("please enter a word");

        String name= input.nextLine();
        int lastIndexOfNAme=name.length()-1;
        String result="";

        for (int i =lastIndexOfNAme; i >=0 ; i--) {

           result+=name.charAt(i);

        }
        System.out.println(result);

        System.out.println("please enter word");
        String name1= scan.nextLine();

        int index=name1.length()-1;
        String reverse="";


        for (int i =index; i >=0 ; i--) {

            reverse+=name1.charAt(i);

        }
        System.out.println(reverse);
    }
}
