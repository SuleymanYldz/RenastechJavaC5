package Assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortArrayLIst {

    //8. Write a Java program to sort a given array list

    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(98,65,32,14,78,909,-47,63,27,-87412));

        Collections.sort(numbers);

        System.out.println("numbers = " + numbers);
    }
}
