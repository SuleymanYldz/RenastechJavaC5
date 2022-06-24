package PracticeGeneral;

public class reverseString1 {

    public static void main(String[] args) {

        System.out.println(ReverseString("Suleyman"));

    }
    public static String ReverseString(String name){

        String reverse="";

        for (int i =name.length()-1; i >=0 ; i--) {
            reverse+=name.charAt(i);
        }
        return reverse;
    }
}

