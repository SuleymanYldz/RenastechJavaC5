package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class serach_ArrayLISt {

    //7. Write a Java program to search an element in an array list.

    public static void main(String[] args) {

        ArrayList<String> elements=new ArrayList<>();
        elements.addAll(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));

        System.out.println("elements = " + elements);
        System.out.println(elements.contains("Friday"));
        System.out.println(elements.contains("monday"));

    }
}
