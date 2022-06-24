package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class shuffle_elementsArrayLIst {

    //10. Write a Java program to shuffle elements in a array list. hint : Collections.shuffle(list_Strings);

    public static void main(String[] args) {


        ArrayList<String>elements=new ArrayList<>();
        elements.addAll(Arrays.asList("Virginia","California","Florida","Key west","NewYork"));

        Collections.shuffle(elements);
        System.out.println("elements = " + elements);
    }
}
