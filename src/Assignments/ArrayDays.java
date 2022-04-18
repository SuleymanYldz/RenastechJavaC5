package Assignments;

public class ArrayDays {

    //Question 2
//
//a) Write a statement that declares a string array initialized with the following strings:
//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
//b) Write a loop that displays the contents of each element in the array that you declared.
    public static void main(String[] args) {


        String [] dayArrays={"Sunday", "Monday", "Wednesday", "Thursday", "Friday", "Saturday"};

        for (int i = 0; i <dayArrays.length ; i++) {


            System.out.println(dayArrays[i]);
        }
    }
}
