package Assignments;

import java.util.Scanner;

public class MeaningOfGrade {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int score;
        System.out.println("please enter your score = ");

        score = input.nextInt();
        if (score <= 100 && score >= 90) {
            System.out.println("your grade is A.\n= Excellent");
        } else if (score <= 89 && score >= 80) {
            System.out.println("your grade is B.\n = Good");
        } else if (score <= 79 && score >= 70) {
            System.out.println("your grade is C.\n = Average");
        } else if (score <= 69 && score >= 60) {
            System.out.println("your grade is D,\n = Deficient");
        } else if (score <= 59 && score >= 0) {
            System.out.println("your grade is F.\n = Failing");
        } else {
            System.out.println("Please check your Score.");
        }


        System.out.println("*********************************************");

        Scanner number = new Scanner(System.in);
        int mark;
        System.out.println("plese enter your score = ");

        mark = number.nextInt();
        if (mark >= 90 && mark <= 100) {
            System.out.println("your grade is A.\n= Excellent");
        } else if (mark >= 80 && mark <= 89) {
            System.out.println("your grade is B.\n = Good ");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("your grade is C.\n = Average");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("your grade is D.\n = Deficient");
        } else if (mark <= 50 && mark >= 59){
            System.out.println("your grade is F.\n = failing");
        }else {
            System.out.println("please check your mark");
        }
    }
}

