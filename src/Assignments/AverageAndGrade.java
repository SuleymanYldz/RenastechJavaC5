package Assignments;

public class AverageAndGrade {


    //90-100 A
//80-89  B
//70-79  C
//60-69  D
//0-59  F


    public static void main(String[] args) {

       int num1=63;
       int num2= 98;
       int num3= 37;
       int Sum;
       int Grade;
       int average=(num1+num2+num3) / 3;

        System.out.println("Average is " + (num1+num2+num3) / 3);

       if (average<=100 && average>=90){
         System.out.println(" average is " + average+ "Grade" + " A");
        } else if (average<=89 && average>= 80){
         System.out.println("Grade is " + "B");
       } else if (average <=79 && average>=70) {
           System.out.println("Grade is " + "C");
       } else if (average <=69 && average >=60){
           System.out.println("Grade is " + "D");
       }else if (average <= 59 && average >=50){
           System.out.println("Grade is " + "F");
        }


        System.out.println("**********************");

       int x=98, y=75, z=41;

       int sum= (x+y+z);
       int average1 =sum / 3;

        System.out.println("");

       if (average1<=98 && average>=90){
           System.out.println(" your grade is " + "A");
           System.out.println(" your average is " + average1);
       } else if (average1<=89 && average1>=80){
           System.out.println("your grade is " + "B" );
           System.out.println("your average is " + average1);
       } else if (average1<=79 && average1>= 70){
           System.out.println("your grade is " + "C");
           System.out.println("Your average is " + average1);
       }else if (average1<=69 && average1 >=60){
           System.out.println("your grade is " + "D");
           System.out.println("your average is " + average1);
       } else if (average1<=59 && average1>=0){
           System.out.println("your garde is " + "F");
           System.out.println("your average is " + average1);
       }else {
           System.out.println("invalid score ");
       }



       }


    }
