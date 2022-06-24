package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayLIst {

    //18. Write a Java program to test an array list is empty or not.

    public static void main(String[] args) {

        ArrayList<String>words=new ArrayList<>();
        words.addAll(Arrays.asList("Today","tomorrow","Next week","Next Year"));

        System.out.println("words = " + words);

        words.removeAll(words);

        System.out.println("words = " + words);
    }
}
