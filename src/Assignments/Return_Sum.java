package Assignments;

import PracticeGeneral.SumNumbers;

public class Return_Sum {


    public static void main(String[] args) {

       sum(26, 2);
       sum(3,14);
       sum(2,7);



    }
    public static void sum(int number1 , int number2){

        if (number1!=number2){
            System.out.println(number1+number2);
        }else {
            System.out.println((number1+number2)*2);
        }
    }
}
