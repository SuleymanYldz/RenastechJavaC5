package PracticeGeneral;

import day_15Arrays.Arrays;

public class practiceArrays {

    public static void main(String[] args) {


        int[] numbers = {10, 20, 30, 40, 50, 190, 3, 5, 0, 10};

        System.out.println(numbers[2]);
        System.out.println(numbers[0]);

        int secondNumber = numbers[1];
        System.out.println("second number is:" + secondNumber);
        //  System.out.println("numbers[15 = " + numbers[15] ); // we dont have index 15

        System.out.println("****************************************");

        int[] number = {12, 24, 36, 48, 56, 62, 78, 95, 47, 85, 20, 314};

        System.out.print(number[0]);
        System.out.print(number[1]);
        System.out.print(number[2]);
        System.out.print(number[3]);
        System.out.print(number[4]);
        System.out.print(number[5]);
        System.out.print(number[6]);
        System.out.print(number[7]);
        System.out.print(number[8]);
        System.out.print(number[9]);
        System.out.print(number[10]);
        System.out.print(number[11]);

        System.out.println("---------------------------------------------");

        int [] numberList= {10,20,30,40};

        String [] names={"Java" ,"Python","Suleyman","Nisa",};

        System.out.println("names[1] = " + names[1]);

        System.out.println("names[2] = " + names[1]);

        System.out.println("numberList[2] = " + numberList[2]);

        for (int i = 0; i <4 ; i++) {
            System.out.println(names[i]);

        }
        System.out.println("------------------------------------------");

        int [] number1= {1,3,5,7,9,1,13,15,17,19,21,22};

        if (number1 [2]< number1 [8]){
            System.out.println(" This is  biggest number");
        }else {
            System.out.println(" this is not");
        }

        if (number1[0] < number1[11]){
            System.out.println(number1[11] + " is  biggest number");
        }else {
            System.out.println(number1[0] + " is smallest number");
        }
        System.out.println("----------------------------------------------");

        String engineer=new String();

        String [] engineers=new String[5];

        System.out.println("engineers[2] = " + engineers[2]);

        engineers[2]="Suleyman";
        System.out.println("engineers[2] = " + engineers[2]);
        engineers[4]="Devil";
        System.out.println("engineers[4] = " + engineers[4]);

        int length= engineers.length;
        System.out.println(length);


        for (int i = 0; i <=engineers.length -1; i++) {
            System.out.println(engineers[i]);

        }

        System.out.println("---------------------------------");

        boolean[] listOfBooleans={ true,false,true,false,true};
        boolean[] listOfBooleans2=new boolean[3];

        System.out.println(listOfBooleans2[0]);

        listOfBooleans2[0]=true;
        listOfBooleans2[1]=true;
        listOfBooleans2[2]=false;

        System.out.println(listOfBooleans2[2]);
        System.out.println(listOfBooleans2[1]);
        System.out.println(listOfBooleans2[0]);

        System.out.println("------------------------------");

        boolean [] list1={true,false,true,true,true,false,true,true};


        for (int i = 0; i <list1.length ; i++) {
            if (list1[i]){
                System.out.println("passed");
            }else {
                System.out.println("failed");
            }

        }


    }

}
