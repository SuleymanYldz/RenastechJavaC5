package PracticeGeneral;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertArray {


    //3. Write a Java program to insert an element into the array list at the first position.

    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(10,20,30,40,50,60));
        System.out.println("numbers = " + numbers);
        numbers.add(3,115);
        System.out.println("numbers = " + numbers);
    }

}
