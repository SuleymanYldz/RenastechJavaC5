package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class emptyArrayLIst {

    //17. Write a Java program to empty an array list.

    public static void main(String[] args) {

        ArrayList<String>words=new ArrayList<>();

        words.addAll(Arrays.asList("Doctors","Teacher","FrontDesk","police","Driver","Cook"));

        words.remove(3);

        System.out.println("words = " + words);

        words.removeAll(words);
        System.out.println("words = " + words);

    }
}
