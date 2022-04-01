package Assignments;

public class multiplicationTable {

    public static void main(String[] args) {

        for (int i = 1; i <=10; i++) {

            for (int j = 1; j <=10 ; j++) {
                System.out.println(i + " * " + j + " : "+ (i*j));
        }

        }

        System.out.println("************************");

        for (int a = 1; a <=100; a++) {
            for (int b= 1; b <=100; b++) {
                System.out.println(a + " x " +  b + " = " +  (a * b));
            }

        }
        System.out.println("*****************");

        for (int i = 1; i <=10; i++) {
            System.out.println("----------------------------");
            System.out.println("Table of " + i);
            System.out.println("----------------------------");
            for (int j = 1; j <=10; j++) {
                System.out.println( i + " * " + j + " = " + (i*j));

            }

        }


    }
}
