package Assignments;

public class Array {

    //Question 1
//
//Write Java statements that do the following:
//a) Declare an array numArray of 15 elements of type int.
//b) Output the value of the tenth element of the array alpha.
//c) Set the value of the fifth element of the array alpha to 35.
//d) Set the value of the ninth element of the array alpha to the sum of the sixth and thirteenth elements of the array alpha.

    public static void main(String[] args) {

        int [] numbers={12,30,63,27,65,-90,70,85,61,50,21,8500,74,632,-147};

        System.out.println("numbers of Array : " + numbers.length);

        numbers [5] =35;
        numbers [9]= numbers[6] + numbers[13];

        System.out.println("NumArray[5] : "+ numbers[5]);
        System.out.println("NumArray[9] : "+ numbers[9]);

    }
}
