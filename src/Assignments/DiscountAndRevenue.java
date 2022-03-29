package Assignments;

import java.util.Scanner;

public class DiscountAndRevenue {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);
        System.out.println("Please Enter the Price");
        int price= Scan.nextInt();
        System.out.println("please Enter the quality");
        int quality=Scan.nextInt();
        int revenue= price*quality;
        System.out.println("your revenue is  = " + revenue );
        int discount= (revenue*10)/100;
        if (revenue > 50000) {

            System.out.println("Your discount is = " + discount);


            System.out.println("****************************");

            Scanner Scan2 = new Scanner(System.in);
            System.out.println("Please enter the price");
            int price2 = Scan.nextInt();
            System.out.println("please enter the quality");
            int quality2 = Scan.nextInt();
            int revenue2= price2*quality2;
            System.out.println("My revenue is = " + revenue2);
            int discount2= (revenue2*10)/100;
            if (revenue2 > 5000) {

                System.out.println("my discount is  = " + discount2);
            }

        }
    }
}
