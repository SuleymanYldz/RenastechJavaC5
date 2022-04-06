package Assignments;

import java.util.Scanner;

public class MultiblicationTable {

    public static void main(String[] args) {


        for (int i = 1; i <10; i++) {
            System.out.println("****************************");
                System.out.println("Table of " + i);
                System.out.println("************************");

            for (int j = 0; j <=10; j++) {
                System.out.println(i + "*"+ j + "="+ (i*j));

            }
            System.out.println();

        }


    }
}
