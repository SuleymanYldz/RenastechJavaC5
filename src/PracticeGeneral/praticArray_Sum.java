package PracticeGeneral;

import java.util.Scanner;

public class praticArray_Sum {

    public static void main(String[] args) {


        int [] number=new int[10];
        int sum=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 10 Numbers ");



        for (int i = 0; i <number.length ; i++) {

            int input= scan.nextInt();
            sum=sum+input;

        }
        System.out.println(sum);
    }
}
