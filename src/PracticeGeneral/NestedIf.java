package PracticeGeneral;

import java.util.Scanner;

public class NestedIf {

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("please enter the number ");
        int number1= scan.nextInt();
        System.out.println("please enter second Number");
        int number2= scan.nextInt();
        System.out.println("please enter third Number");
        int number3= scan.nextInt();


        if (number1 > number2 && number1 > number3){
            System.out.println(number1 + " is Biggest number ");

        }else if (number2> number1 && number2 > number3){
            System.out.println( number2 + " is biggest Number ");
        }else {
            System.out.println(number3 + " is Biggest Number");
        }
    }
}
