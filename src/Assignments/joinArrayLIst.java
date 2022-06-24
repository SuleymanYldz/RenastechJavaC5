package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class joinArrayLIst {

    //15. Write a Java program to join two array lists.

    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(21,34,63,47,65));

        ArrayList<Integer>numbers2=new ArrayList<>();
        numbers2.addAll(Arrays.asList(10,20,30,40,50,60,70,80));


        numbers.addAll(numbers2);
        System.out.println(numbers);

    }
}
