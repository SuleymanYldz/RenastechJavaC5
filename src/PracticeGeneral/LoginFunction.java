package PracticeGeneral;

import java.util.Scanner;

public class LoginFunction {

    public static void main(String[] args) {


        String name="renastech";
        String password="renastech123";


        Scanner scan=new Scanner(System.in);
        System.out.println(" enter user name ");

        String userinputname=scan.nextLine();
        System.out.println("enter password");
        String userinputPassword= scan.nextLine();

        if (userinputname.equals(name)&& userinputPassword.equals(password) ){

            System.out.println(" you have succcesfully log in");
        }else {
            System.out.println(" login functaion has failad");
            System.out.println("invalid user");
        }


    }
}
