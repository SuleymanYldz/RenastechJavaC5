package Assignments;

public class FindLargestNumberusingIfelseIf {

    public static void main(String[] args) {

        int num1= 25 , num2= 45, num3= 56;
        if (num3>= num2 && num3 >= num1)
            System.out.println(num3 +  " is largest number");

        else if (num2>= num3 && num2 >= num1)
            System.out.println(num2 + "is largest number");

            else
        System.out.println(num1 + " is largest number");


        System.out.println("*****************");

        int a= 150, b= 250, c= 500;

        if (c >=b && c>=a)
            System.out.println(c + " is largest number");
        else if (b>= c && b>=a)
            System.out.println(b +" is largest number");
        else
            System.out.println(a + " is largest number");

        System.out.println("******************");

        int x= 750, y= 1500, z= 2300;

        if (z >= y && z>=x)
            System.out.println( z + "is biggest number");
        else if (y>=z & y>= x)
            System.out.println( y + "is biggest number");
        else
            System.out.println(x + " is biggest number");


        System.out.println("**********************");

        int tulay=15, nisa=10, tuba=8;
        if (tulay>=nisa && tulay>=tuba)
            System.out.println(tulay + " is oldest one");
        else if (nisa>= tulay && nisa>=tuba)
            System.out.println(nisa + " is oldest one");
        else
            System.out.println(tuba + " is oldest one");
    }
}
