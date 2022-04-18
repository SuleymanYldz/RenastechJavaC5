package Assignments;

import java.util.Scanner;

public class Array_Reference {

    //Question 4
//
//The variable list1 and list2 are reference arrays that each have 5 elements.
// Write code that copies the values in list1 to list2. Values in list1 are input by user.
    public static void main(String[] args) {

         int [] list1= new int[5];
         int [] list2= new int[5];

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter Numbers");
        for (int i = 0; i <list1.length ; i++) {

            list1[i] = scan.nextInt();
        }
        for (int i = 0; i < list2.length ; i++) {
            list2[i]=list1[i];

            System.out.println(list1[i]);

        }

    }
}
