package PracticeGeneral;

public class Array {

    public static void main(String[] args) {

        int [] numbers={ 4,-90,200,5};
        int sumOfTheArray=0;

        for (int i = 0; i <numbers.length ; i++) {
            sumOfTheArray+=numbers[i];

        }
        System.out.println("Sum of the array : " + sumOfTheArray);

        int [] ages=new int[5];

        System.out.println(ages[2]);

        ages [2]=50;
        System.out.println(ages[2]);
        System.out.println(ages[3]);

        System.out.println("---------------------------------------");

        boolean [] foundJOB=new boolean[3];

        System.out.println(foundJOB[0]);
        System.out.println(foundJOB[1]);

        foundJOB[0]= true;
        System.out.println("foundJob = " + foundJOB[0]);
        
    }
}
