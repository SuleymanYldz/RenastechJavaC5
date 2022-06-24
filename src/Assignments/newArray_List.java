package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class newArray_List {


   // 1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

    public static void main(String[] args) {


        ArrayList<String>color=new ArrayList<>();

        color.addAll(Arrays.asList("Blue","Red","White","Yellow"));

        for (String Colors: color){


        }
        System.out.println(color);

    }
}
