package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_maxNumber_Array {

    public static void main(String[] args) {


        int [] number={25,50,45,75,90,150,74,65,8550,95,-10,47,};

        int maxNumber=number[0];

        for (int i = 0; i <number.length ; i++) {
            if (number [i] > maxNumber){

                maxNumber= number[i];
            }
        }
        System.out.println("maxNumber = " + maxNumber);
        System.out.println("-------------------------------");


        ArrayList<Integer> number2=new ArrayList<>();

        number2.addAll(Arrays.asList(12,24,36,48,60,72,94,36,108));

        int maxnumber=number2.get(0);

        for (int i = 0; i <number2.size() ; i++) {

            if (number2.get(i) > maxnumber){

                maxnumber=number2.get(i);
            }
        }
        System.out.println("maxnumber = " + maxnumber);
    }
}
