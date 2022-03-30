package Assignments;

import com.sun.javaws.IconUtil;

public class odd_even_divisiple_3and5 {

    public static void main(String[] args) {

        System.out.println("Number can be divided by 3 and 5");


        for (int i=0; i<=100; i++){

            if (i %2!=0 && i%3==0 && i%5==0){
                System.out.println(i + " is Odd number");
        }
            if (i%2==0 && i%3==0 && i%5==0){
                System.out.println(i + " is Even Number");
            }

        }
    }
}
