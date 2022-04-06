package PracticeGeneral;

import java.util.Scanner;

public class nestedif2Practice {


    /*

 //create a java program to check if person is eligible to give blood
    //requirement to give blood :
    //person needs to be older than 18
    //person weight needs to be more then 50

    //expected output :
    // if person age is smaller and equal to 18
    //print :"Person needs to be older than 18 "
    //if person age is bigger 18 and weight is bigger then 50
    //"Person is eligible to give blood"

    //example test data is person age is 15 weight is 150
    //"Person needs to be older than 18 "
    //example test data is person age is 20 weight is 40
    //"Person is not eligible to give blood "
    //example test data is person age is 20 weight is 100
    ////"Person is eligible to give blood"

    //example test data is person age is 18 weight is 55
    //"Person needs to be older than 18 "


     */
    public static void main(String[] args) {


        int age=18;

        int weight=50;

        if (age <= 218 ){
            System.out.println(" You need to be older than 18");
            if (age <18 && weight <40){
                System.out.println("You can give to blood");
            }
        }

        System.out.println("******************************");

        int age1=60;

        if ( age1 < 90 ){
            System.out.println(" You are young ");
            if(age  < 30){
                System.out.println(" You are really very young");

            } else if (age > 18) {
                System.out.println("You are Old");
            }else if (age < 80){
                System.out.println(" You should be death so far wjy are you still alive");
            }
        }

        System.out.println(" *********************");

        int temperature= 40;

        boolean sunny =true;


        if (temperature > 25 ){
            System.out.println(" Hot");
            if ( temperature >30 && sunny == true){
                System.out.println(" the Weather is hot and sunny");
            }
        }

        System.out.println("**********************************'");

        int Score1=89;
        int Score2=79;
        int Score3=69;
        int Score4=59;
        int Score5=49;
        String Absent=" In valid number ";

        if (Score1 > 79 && Score1 < 90){
            System.out.println(" Your Grade is : A");
            if (Score2 >69 && Score2 <79){
                System.out.println(" Your Grade is : B");
            }else if (Score3 >59 && Score3 <69){
                System.out.println(" Your Grade is : C");
            }else if (Score4 >49 && Score4 < 59){
                System.out.println(" Your Grade is : D");
            }else {
                System.out.println(Absent);
            }
        }
        System.out.println("********************");

        /*

        /create a java program to check if person is eligible to give blood
    //requirement to give blood :
    //person needs to be older than 18
    //person weight needs to be more then 50

    //expected output :
    // if person age is smaller and equal to 18
    //print :"Person needs to be older than 18 "
    //if person age is bigger 18 and weight is bigger then 50
    //"Person is eligible to give blood"

    //example test data is person age is 15 weight is 150
    //"Person needs to be older than 18 "
    //example test data is person age is 20 weight is 40
    //"Person is not eligible to give blood "
    //example test data is person age is 20 weight is 100
    ////"Person is eligible to give blood"

    //example test data is person age is 18 weight is 55
    //"Person needs to be older than 18 "
         */

       String name= "Suleyman";
       int age2=18;
       int Weight=60;

       if (age2 <= 18 ){
           System.out.println("You are not eligible to give blood");
           if (age2 < 14 && Weight > 50){
               System.out.println(name  + " You are eligible to give blood");

           }else if (age >15 && Weight < 150){
               System.out.println(" You need to be older than 18");
           }

       }

    }

}
