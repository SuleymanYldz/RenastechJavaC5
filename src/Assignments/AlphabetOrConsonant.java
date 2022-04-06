package Assignments;

import java.util.Scanner;

public class AlphabetOrConsonant {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Word");
        char alphabet=scan.next().charAt(0);

        if ( alphabet== 'a' || alphabet== 'e'|| alphabet=='i'|| alphabet=='o'||alphabet=='u' ){
            System.out.println( alphabet + "  is  Vowel  " );
        }else {
            System.out.println(alphabet  + " is Consonant  "  );
        }



    }
}
