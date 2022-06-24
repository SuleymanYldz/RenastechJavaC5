package Assignments;

import java.util.Arrays;

public class FindUnique {

    //    (String) Find the unique
//    Write a program that can find the unique characters from the String
//
//    Ex:  String str= "AAABBBCCCDEF";  ==>  "DEF";

    public static void main(String[] args) {

        String  words="AAABBBCCCDEF";

        String answer="";

        for (int i = 0; i <words.length() ; i++) {

            int count=0;
            for (int j = 0; j <words.length() ; j++) {
                if (words.charAt(i)==words.charAt(j)){
                    count++;

                }

            }
            if (count==1){
                answer+=words.charAt(i);
            }

        }
        System.out.println(answer);
        System.out.println(" ");
        System.out.println("---------------------------------");


//    Write a program that checks if a string is build-out of the same letters as another string.
//
//    Ex:  same("abc",  "cab"); -> true
//
//    same("abc",  "abb"); -> false:

        String s1="abc";
        String s2="cab";

        String s3="abc";
        String s4="abb";

        char [] ch1=s1.toCharArray();
        System.out.println(Arrays.toString(ch1));
        Arrays.sort(ch1);
        System.out.println(Arrays.toString(ch1));


        char [] ch2=s2.toCharArray();
        System.out.println(Arrays.toString(ch2));
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch2));

        System.out.println("s1 and s2 have same characters : "+ Arrays.equals(ch1, ch2));

        char [] ch3=s3.toCharArray();
        System.out.println(Arrays.toString(ch3));
        Arrays.sort(ch3);
        System.out.println(Arrays.toString(ch3));

        char [] ch4=s4.toCharArray();
        System.out.println(Arrays.toString(ch4));
        Arrays.sort(ch4);
        System.out.println(Arrays.toString(ch4));

        System.out.println(" s3 and s4 have different characters : " + Arrays.equals(ch3,ch4));

    }
}
