package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class remove_ArrayLISt {

    //6. Write a Java program to remove the third element from an array list.

    public static void main(String[] args) {


        ArrayList<Integer>number=new ArrayList<>();

        number.addAll(Arrays.asList(1380,4554,2580,2763));

        number.remove(0);

        System.out.println("number = " + number);

        ArrayList<String> words=new ArrayList<>();

        words.addAll(Arrays.asList("Suleyman","Gulistan","Tulay","Muhammet","Nisa"));

        words.remove(3);
        words.removeAll(Arrays.asList("Tulay"));


        System.out.println(words);

    }
}
