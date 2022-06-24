package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class replaceArrayLIst {

    //21. Write a Java program to replace the second element of a ArrayList with the specified element.

    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(9,18,27,36,45,54,63,72,81,90));

        System.out.println("numbers = " + numbers);

        numbers.set(1,2);

        System.out.println("numbers = " + numbers);
    }
}
