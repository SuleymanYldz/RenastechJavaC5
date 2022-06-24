package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class retrive_elements {

    //4. Write a Java program to retrieve an element (at a specified index) from a given array list.


    public static void main(String[] args) {


        ArrayList<Integer>SpecificNumbers=new ArrayList<>();

        SpecificNumbers.addAll(Arrays.asList(12,24,36,48,60,78,655,474));

        System.out.println("SpecificNumber = " + SpecificNumbers);
        SpecificNumbers.add(3,85);

        System.out.println("SpecificNumbers = " + SpecificNumbers);

        System.out.println(SpecificNumbers.get(6));
    }
}
