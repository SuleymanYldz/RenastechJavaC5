package StudySession;

import PracticeGeneral.Array;

import java.util.Arrays;

public class Same_Letters {

    public static void main(String[] args) {

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

        System.out.println("S1 and S2 have same characters = " + Arrays.equals(ch1,ch2));

        System.out.println("**********************************************");




    }
}
