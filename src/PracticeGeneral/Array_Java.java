package PracticeGeneral;

public class Array_Java {

    // create a java logic that will count letter a or A from given string
    //example
    //JavA
    //output should be 2

    public static void main(String[] args) {

        String  name="JavA";

        int count=0;


        for (int i = 0; i <name.length() ; i++) {

            if (name.charAt(i)=='a'||name.charAt(i)=='A'){
                count++;


            }

        }
        System.out.println(count);

    }
}
