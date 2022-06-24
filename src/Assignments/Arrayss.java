package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrayss {


    //3. Write a Java program to insert an element into the array list at the first position.

    public static void main(String[] args) {


        ArrayList<Integer>Numbers=new ArrayList<>();

        Numbers.addAll(Arrays.asList(15,35,45,60,75,90,10,5,74,65));


        System.out.println(Numbers);
        Numbers.add(6,8);
        System.out.println(Numbers);
    }
}
