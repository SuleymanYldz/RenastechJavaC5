package Mylibrary;

public class findUnique {

    /*
Write a program that can print out the unique values from a String Array
      Ex:
        if arr -> {"A", "A", "B", "C", "C"}
        output: B
        if arr -> {"A", "B", "B", "C"}
        output: A
             C
 */

    public static void FindingUnique() {

        String words = "A,A,B,C,C";

        String result = " ";

        for (int i = 0; i < words.length(); i++) {
            int count = 0;
            for (int j = 0; j < words.length(); j++) {
                if (words.charAt(i) == words.charAt(j)) {
                    count++;
                }

            }
            if (count == 1) {
                result += words.charAt(i);
            }

        }
        System.out.println(result);


    }

    public static void main(String[] args) {

        FindingUnique();
        FindingUnique();
    }



    }

