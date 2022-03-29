package Assignments;

import java.util.Scanner;

public class CodingAlexaforWeather {

    //Coding Alexa for Weather [multiple Conditions]
   //Convert the value to Celsius formula :  C = F-32 / 1.80


    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        System.out.println("What is the Temperature as Fahrenheit ");
        double Temperature= input.nextDouble();

        double Fah=(Temperature-32) /1.80;

        if (Fah < -10){
            System.out.println("it is too cold" + Fah);
        }else if (Fah >-10 && Fah <0){
            System.out.println("it is cold" + Fah);
        }else if (Fah > 0 && Fah <15){
            System.out.println("it is not cold" + Fah);
        }else if (Fah >15 && Fah < 40){
            System.out.println("It is warm");
        }else if (Fah > 40 && Fah < 60){
            System.out.println("it is extremely hot " + Fah);
        }else {
            System.out.println("Hot as Hell" + Fah);
        }


    }
}
