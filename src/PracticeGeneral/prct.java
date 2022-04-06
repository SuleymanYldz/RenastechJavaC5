package PracticeGeneral;

import java.util.Scanner;

public class prct {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your Age");

        int age= scan.nextInt();
        System.out.println("Please enter your Weight");
        double Weight= scan.nextInt();
        if (age <18 ){
            if (Weight < 50)
                System.out.println(" You are not eligible to give blood");
        }

        System.out.println("************************************");


        int a=50;
        int b=60;
        int c=70;

        if (c > b){
            if (c > a )
                System.out.println(c + " is biggest number ");
        }else
            if (a < b ){
                if ( a < c)
                    System.out.println( a + " is smallest numer");
            }
        System.out.println("********************************");


            Scanner scanner=new Scanner(System.in);


    }
}
