package PracticeGeneral;

public class reverseString2 {

    public static void main(String[] args) {

        System.out.println(reverseString("Colombia"));

    }
    public static String reverseString(String word){

        String reverse="";

        for (int i =word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);

        }
        return reverse;
    }
}
