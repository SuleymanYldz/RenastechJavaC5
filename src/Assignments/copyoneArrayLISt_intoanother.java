package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class copyoneArrayLISt_intoanother {

    //9. Write a Java program to copy one array list into another.

    public static void main(String[] args) {


        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(2,4,6,8,10,14,1,8,24,32));
        ArrayList<Integer> secondnumbers=new ArrayList<>();

        secondnumbers=numbers;
        System.out.println("numbers = " + secondnumbers);


    }

}
