package PracticeGeneral;

import java.util.Scanner;

public class Removecharacter {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter word");
        String word= scan.nextLine();
        System.out.println(word);

        String result="";


        if (word.substring(0,1).equalsIgnoreCase("a")){
            word=word.substring(1);

        }
        System.out.println(word);


        int length=word.length();
        int lastIndex=word.length()-1;
        if (word.substring(lastIndex).equalsIgnoreCase("A")){

            word=word.substring(0,lastIndex);


        }
        System.out.println(word);
    }
}
