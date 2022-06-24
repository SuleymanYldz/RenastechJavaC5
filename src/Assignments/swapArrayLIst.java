package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class swapArrayLIst {

    //14. Write a Java program of swap two elements in an array list.

    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(3,6,9,12,45,63,74,85,20,1447,-20));

        Collections.swap(numbers,3,7);
        System.out.println("numbers = " + numbers);

    }
}
