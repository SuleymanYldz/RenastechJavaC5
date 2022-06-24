package Assignments;

import java.util.Arrays;

public class DivisibleBy3Array {

  //  Create a java program that will print only numbers that divisible by 3,  int [] arr={23,25,26,32,42,51,99,2};

    public static void main(String[] args) {

        int [] numbers={23,25,26,32,42,51,99,2};


        for (int i = 0; i <numbers.length ; i++) {

            if (numbers[i]%3==0){
                System.out.print(numbers[i]+ " ");
            }

        }
        System.out.println("  ");
        System.out.println("---------------------------------");

        //Create a java program that will print sum of the ODD numbers from given array.  int[] arr={2,3,5,6,56,0,53};


        int [] number={2,3,5,6,56,0,53};

        int startingpoint=0;
        int endingPoint=number.length-+1;
        int sum=0;
        while ( startingpoint<= endingPoint){
            if (number[startingpoint] %2!=0){

                sum=sum+number[startingpoint];

            }
            startingpoint++;
        }
        System.out.println("sum of the numbers :" + sum);

        System.out.println(" ");

        System.out.println("**********************");

        //create a java program that will print numbers from biggest number to smallest number. int [] arr={2,90,4,-99, 99,73};


        int [] arr={2,90,4,-99, 99,73};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // smallest  to biggest

        int [] biggestToSmallest=new int[arr.length];

        int temp=0;

        for (int i = arr.length-1; i >=0 ; i--) {
            biggestToSmallest[temp]=arr[i];
            temp++;

        }
        System.out.println(Arrays.toString(biggestToSmallest));
        System.out.println("  ");
        System.out.println("---------------------------");

        int [] nums={10,25,30,45,80,-4140,65,80,9875,54,21,456,-587,25};

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int [] bigTosmall=new int[nums.length];
        int temporary=0;

        for (int i =nums.length-1; i >=0 ; i--) {
            bigTosmall[temporary]=nums[i];
            temporary++;


        }
        System.out.println(Arrays.toString(bigTosmall));
    }
}
