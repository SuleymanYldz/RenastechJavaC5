package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class compare_TwoArrayLISt {

    //13. Write a Java program to compare two array lists.

    public static void main(String[] args) {

        ArrayList<String>elements=new ArrayList<>();
        elements.addAll(Arrays.asList("New Jersey","Dakota","Washington","PenState"));

        ArrayList<String>elements2=new ArrayList<>();
        elements2.addAll(Arrays.asList("Virginia","North Carlina","West Virginia"));


        System.out.println(elements.equals(elements2));

    }
}
