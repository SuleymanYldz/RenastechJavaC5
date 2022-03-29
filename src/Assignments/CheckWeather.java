package Assignments;

public class CheckWeather {

    //task 3: create Program to check whether the given number is positive or negative
// → If a number is greater than zero then it is a positive number
//     → If a number is less than zero then it is a negative number
//     → If a number is equal to zero then it is neither negative nor positive.

    public static void main(String[] args) {

        int weather=10;
        if (weather>0)
            System.out.println(weather + " is positive number");
        if (weather<0)
            System.out.println(weather + " is negative number");
        if (weather == 0)
            System.out.println(weather + " is neither negative nor positive");

        System.out.println("***************************");

        int today=0;
        if (today>0)
            System.out.println(today +" is positive day");
        else if (today<0)
            System.out.println(today + " is negative day");
        else
            System.out.println(today + " is neither negative nor positive");


        System.out.println("***************************");

        int tomorrow=3;

        if (tomorrow> 0)
            System.out.println(tomorrow + " is a hot day");
        else if ( tomorrow<0)
            System.out.println(tomorrow + " is cold day");
        else
            System.out.println(tomorrow + " is neither hot nor cold");
    }
}
