package Assignments;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double bill, tip, total;

        System.out.println("please enter your bill :  ");
        bill = scan.nextInt();
        System.out.println(" Detail of your Check is  Here");

        if (99 < bill && bill < 280) {
            tip = bill * (3.0 / 20);

        } else {
            tip = bill * (1.0 / 5);
        }
        total=tip+bill;
        System.out.println(" Bill value : " + (bill));
        System.out.println(" Tip Value : " + (tip));
        System.out.println("Total amount : " + (total));


        System.out.println("**********************************");


        double Bill =250;
        double Tip2 = (Bill * 15 /100);
        double Tip3 =(Bill * 20 /100);

        if (Bill<=99 && Bill>=280){
            System.out.println("Bill is :" + Bill);
            System.out.println("Tip is :" +Tip2);
            System.out.println("The Total amount is : " + (Bill+Tip2));
        } else {
            System.out.println("Bill is :" + Bill);
            System.out.println("Tip is :" + Tip3);
            System.out.println("The Total amount is :" + (Bill + Tip3));}



    }

}