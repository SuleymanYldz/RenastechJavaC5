package PracticeGeneral;

import java.util.Arrays;

public class returnMethod {

    public static void main(String[] args) {


        System.out.println(sameLetters(" abcd","dbca"));
        System.out.println(sameLetters(" karpuz", "puzkan"));
    }
    public static boolean sameLetters(String word, String word2){


        char [] first=word.toCharArray();
        char [] second=word2.toCharArray();

        Arrays.toString(first);
        Arrays.toString(second);

        boolean answer=Arrays.equals(first,second);
        return answer;


    }
}
