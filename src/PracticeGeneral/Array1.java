package PracticeGeneral;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

   //create a java program that will ask for 5 string name to store in the array
//and print first and last letter from each string
//example
//input : berkan , firas ,merve ..
//output : bn , fs ,me


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 5 names" );
        String [] names= new String[5];

        for (int i = 0; i < names.length; i++) {

            String name=scan.next();
            names[i]=name;

        }
        System.out.println(Arrays.toString(names));
       for (String each: names){
           System.out.println(each.charAt(0) + ""+ each.charAt(each.length()-1));
       }
    }
}
