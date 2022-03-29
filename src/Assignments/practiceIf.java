package Assignments;

public class practiceIf {

    public static void main(String[] args) {

        int number1=20;
        int number=21;

        if (number1<number){
            System.out.println("Number1 is bigger than number");
        }
        if (number1 !=number){
            System.out.println("Number are not equal");
        }
        System.out.println("******************************");

        String todayDate="March 10";
        String newrozDate="March 21";



        if (todayDate==newrozDate){
            System.out.println("Happy Newroz");
        }


        todayDate ="March 21";
        if (todayDate==newrozDate){
            System.out.println(" Happy Newroz");
        }

        System.out.println("**********************************************");

        int num1=99;
        int num2=45;

        if (num1 > num2){
            System.out.println(num1 + " is bigger");
        }else {
            System.out.println(num2 + " is bigger");
        }
        System.out.println("*****************");

        if (!false) {

            System.out.println("hello world");
        }else {
            System.out.println("Hello mars");
        }

        System.out.println("*********************");

        int number3=40;

        int number4=50;

        int number5=60;

        if (number3 > number4 && number3 > number5){
            System.out.println(number3 + " is biggest number");
        }else if (number4 > number3 && number4 >number5){

        }else {
            System.out.println(number5 + " is biggest number");
        }

        System.out.println("*********************");

        if (!false){
            System.out.println("heloo slm");

        }else if (!false){
            System.out.println("helllllll");

        }else if (!false){
            System.out.println("sssssssssssssssss");

        }else {
            System.out.println("hiy guys");


        }



    }
}
