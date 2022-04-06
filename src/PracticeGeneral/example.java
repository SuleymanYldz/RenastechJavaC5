package PracticeGeneral;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class example {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double userMoney;
        final double PRICE_OF_SHOES = 5;

        System.out.println(" How much money do you have ? ");
        userMoney = scan.nextDouble();

        if (userMoney >=PRICE_OF_SHOES){
            System.out.println( "Your "  + userMoney + "is enough to buy the" + PRICE_OF_SHOES  + "here you go");

        }else {
            if (userMoney ==4 ){
                System.out.println("your " + userMoney + " is not enough to buy " + PRICE_OF_SHOES );

            }else {
                System.out.println("your " + userMoney + " is not enough to buy " + PRICE_OF_SHOES );
            }
           // System.out.println("your " + userMoney + " is not enough to buy " + PRICE_OF_SHOES );

        }
    }
}
