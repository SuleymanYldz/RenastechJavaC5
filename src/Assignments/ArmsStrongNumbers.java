package Assignments;

import java.util.Scanner;

public class ArmsStrongNumbers {

    public static void main(String[] args) {


        int num=153, result=0, remainder;

        int temp=num;

        while (num>0){
            remainder=num%10;
            num=num/10;
            result=result+(remainder*remainder*remainder);

        }
        if (result==temp){
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("Not a Armstrong Number");
        }
    }
}
