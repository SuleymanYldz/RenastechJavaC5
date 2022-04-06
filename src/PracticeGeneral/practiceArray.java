package PracticeGeneral;

import java.util.Arrays;

public class practiceArray {

    public static void main(String[] args) {


        int[] numbers = {34, 50, 90, 99, -90};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] biggestToSmallest = new int[numbers.length];

        int temp = 0;

        //    i= 5-1=4
        for (int i = numbers.length - 1; i >= 0; i--) {

            // i=4                  4>=0  i--
            // i=3                  4>1 i --


            biggestToSmallest[temp] = numbers[i];

            //biggestToSmallest[0] =  numbers[4] >>>>>>99
            //biggestToSmallest[1] =  numbers[3] >>>>>>90
            //biggestToSmallest[2] =  numbers[2] >>>>>>50
            //biggestToSmallest[3] =  numbers[1] >>>>>>34
            //biggestToSmallest[4] =  numbers[0] >>>>>-90

            temp++; //0++ , 1++ , 2++ , 3++ , 4++


        }
        System.out.println("**************************");
        System.out.println(Arrays.toString(biggestToSmallest));

        System.out.println("***********************************");
        ////write a program that can return the largest string of text from an array
        ////ex         String[] names = {"denver", "texas", "orlando", "Toronto", "jeniffer", "sevgin", "renastechschool"};
        ////output :renastechschool

        String [] names={"denver","texas","orlando","Toronto","jeniffer","sevgin","renastechschool"};

        System.out.println(names[2].length()); //2

        int maxlenghtIndex=names[0].length();

        for (int i = 0; i < names.length; i++) {

            if (names[i].length()> maxlenghtIndex){
                maxlenghtIndex=i;
            }

        }

        System.out.println(names[maxlenghtIndex]);

    }
}
