package PracticeGeneral;

import day01_introduction.Helloworld;

public class Flag {


    /*
    Write a Java program to print an American flag on the screen. Go to the editor
Expected Output

* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
==============================================
==============================================
==============================================
==============================================
==============================================
==============================================

     */

    public static void main(String[] args) {

        String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
        String p2 = "==============================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
            
        }
        System.out.println("* * * * * * ==================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
            
        }

        System.out.println("Hello world");

        String a1="* * * * * ===============================";
        String b1="* * * * * ===============================";
        String c1="* * * * *  ==============================";
        for (int i = 0; i <4 ; i++) {
            System.out.println(a1);

        }
        System.out.println("* * * * * ==============================");
        for (int i = 0; i <=5; i++) {
            System.out.println(b1);

        }
    }
}
