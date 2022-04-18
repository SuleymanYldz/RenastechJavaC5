package PracticeGeneral;

import java.util.Arrays;

public class methodReverse {

    public static void main(String[] args) {

        Methods.evenNumber();
        methods3.AgeCategory(50);
        reserveString("Suleyman");
        reserveString("urfa");

    }
    public static void reserveString(String name){

        String reserveResult="";

        for (int i =name.length()-1; i >=0 ; i--) {
            reserveResult+=name.charAt(i);

        }
        System.out.println("reserveResult = " + reserveResult);
    }


}
