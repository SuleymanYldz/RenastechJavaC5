package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class reverseArrayLIst {

    //11. Write a Java program to reverse elements in an array list.

    public static void main(String[] args) {


        ArrayList<String> elements=new ArrayList<>();
        elements.addAll(Arrays.asList("Suleyman","Turkey","Usa","Colombia"));

        Collections.reverse(elements);
        System.out.println("elements = " + elements);
    }
}
