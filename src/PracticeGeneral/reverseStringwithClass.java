package PracticeGeneral;

import Assignments.Array;

import java.util.ArrayList;
import java.util.Arrays;

public class reverseStringwithClass {

    public static void main(String[] args) {

        System.out.println(reverseStrring("Hello"));
        printNumberDividedBy3();


        int []array2={10,20,30};
        System.out.println(sumOfOddNumber(array2));


        System.out.println(Arrays.asList(evenNumbers()));
    }
    public static String reverseStrring(String word){

        String reverse="";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse+=word.charAt(i);

        }
        return reverse;
    }
    public static ArrayList<Integer>evenNumbers(){

        ArrayList<Integer>evenNumber=new ArrayList<>();

        for (int i = 0; i <100 ; i++) {
            if (i %2==0){
                evenNumber.add(i);
            }

        }
        return evenNumber;
    }

    static void printNumberDividedBy3(){

        for (int i = 3; i <127 ; i++) {
            if (i % 3==0){
                System.out.println(i);
            }
        }
    }
    protected static int sumOfOddNumber(int []array){
        int sumOfNumbers=0;

        for (int i = 0; i <array.length ; i++) {
            if (array [i] %2 !=0){
                sumOfNumbers+=array[i];
            }

        }
        return sumOfNumbers;
    }
}
