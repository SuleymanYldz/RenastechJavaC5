package Assignments;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {


        String sentence="Java is Fun";

        String []splitSentence=sentence.split(" ");
        System.out.println(Arrays.toString(splitSentence));

        String reverseSentence=""; //to store reversed sentence

        for (int i = splitSentence.length -1; i >=0 ; i--){
            reverseSentence += splitSentence[i] + " " ;

        }


        System.out.println(reverseSentence);

        String sentence2="Java is fun";
        String [] split2=sentence2.split(""); // we will split from each letter abd store into string array

        String reverse2="";

        for (int i = split2.length-1 ; i >=0 ; i--){

            reverse2 += split2[i] ;
        }

        System.out.println(reverse2);


    }
}
