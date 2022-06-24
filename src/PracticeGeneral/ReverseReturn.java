package PracticeGeneral;

public class ReverseReturn {

    public static void main(String[] args) {

        System.out.println(reverseString("Virginia"));

    }
    public static String reverseString(String word){


        String result="";

        for (int i=word.length()-1; i>=0; i--){
            result+= word.charAt(i);
        }
        return result;
    }
}
