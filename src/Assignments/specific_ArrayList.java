package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class specific_ArrayList {

    //5. Write a Java program to update specific array element by given element.

    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(987,654,321,74,12,36,54,74,98));

        System.out.println(numbers);
        numbers.add(7,60);

        numbers.set(2,6);

        System.out.println("numbers = " + numbers);
    }
}
