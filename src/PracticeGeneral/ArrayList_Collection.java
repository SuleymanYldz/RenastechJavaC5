package PracticeGeneral;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayList_Collection {

    //1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

    public static void main(String[] args) {


        ArrayList<String>elements=new ArrayList<>();

        elements.addAll(Arrays.asList("Blue","White","Pink","black"));

        Collections.sort(elements);

        System.out.println("elements = " + elements);

        elements.remove(3);

        System.out.println("elements = " + elements);

        elements.add("Grey");
        System.out.println("elements = " + elements);

    }
}
