package PracticeGeneral;

public class ArrayPractices {


    public static void main(String[] args) {


        int [] arr={5,-15,35};

        System.out.println(arr.length);

        int [] arr2=new int[20];
        System.out.println(arr2.length);
        System.out.println(arr2[5]);


        // store from, 3 to 22
        // arr2[0]=3
        // arr2[1]=4
        // arr2[2]=5

        // arr2[19]=22

        System.out.println("----------------------------------");

       //arr2[0]=3;
        // arr2[1]=4;
       // arr2[2]=5;

        for (int i = 0; i <=arr2.length -1 ; i++) {
            arr2[i]=i+3;

            System.out.println(arr2[i]);


        }
        System.out.println("**************************************");

        int [] number={5,8,10};

        number[1]=20;
        System.out.println(number[1]);

        number[0] = number[2];
        System.out.println(number[1]);
        System.out.println(number[2]);

    }
}
