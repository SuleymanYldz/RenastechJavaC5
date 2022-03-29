package Assignments;

import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the your  Birth of Date");
        int age = input.nextInt();
        int Current = 2022;
        int userage = Current - age;
        Scanner userinput = new Scanner(System.in);
        System.out.println("Enter your Lucky number");
        int UserLuckyNumber = userinput.nextInt();
        int myLuckyNumber = 63;

        if (userage >= 18) {
            if (UserLuckyNumber == myLuckyNumber) {
                System.out.println("Your age is " + userage + "\n Congralations you won 1 million $$$");
            } else {
                System.out.println("your lucky number not match , try again");
            }
        } else{
                System.out.println(" your age is " + userage + "years");
                System.out.println("you are under the age , you cant join lottery.");
            }
            }
        }




