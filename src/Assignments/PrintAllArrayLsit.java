package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintAllArrayLsit {


    //22. Write a Java program to print all the elements of a ArrayList using the position of the elements.

    public static void main(String[] args) {

        ArrayList<Integer>number=new ArrayList<>();

        number.addAll(Arrays.asList(4,8,12,16,20,24,28,32,36,40));

        System.out.println("number = " + number);

        int numbers=0;

        for (Integer each:number){

            System.out.println( numbers + " index of  " + each);

            numbers++;
        }

    }
}
