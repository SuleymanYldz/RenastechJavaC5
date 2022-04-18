package day09_StringMethods;

import java.util.Scanner;

public class c5_test {

    public static void main(String[] args) {

        String usernme="Helo123";
        String password="java";

        System.out.println("Username :" + usernme);

        System.out.println("usernme = " + usernme);

        System.out.println(password);
        System.out.println("password = " + password);


        System.out.println("***********************************");

        String realName="Suleyman";
        String realPassword="S25802580s";


        Scanner scan=new Scanner(System.in);
        System.out.println("enter user NAme");
        String userName= scan.nextLine();
        System.out.println("enter password");
        String passwordd=scan.nextLine();


        if (userName.equals(realName) && passwordd.equals(realPassword)){

            System.out.println("you log in succesfully");
        }else {
            System.out.println(" try again");
        }
        System.out.println("---------------------------------------");

        String FacebookuserName="Suleyman yildiz";
        String FacebookPassword="S25802580.";

        System.out.println("please enter user name");
        String UserInputName= scan.nextLine();
        System.out.println("enter password");
        String UserInputPassword= scan.nextLine();

        if (FacebookuserName.equals(UserInputName) && FacebookPassword.equals(UserInputPassword)){

            System.out.println("you have succesfully log in");
        }else {
            System.out.println("try again");
        }
    }
}
