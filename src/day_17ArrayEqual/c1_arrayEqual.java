package day_17ArrayEqual;

import PracticeGeneral.Array;

import java.util.Arrays;

public class c1_arrayEqual {

    public static void main(String[] args) {

        int []arr1={3,5,7};
        int []arr2={5,3,7};
        int [] arr3={3,5,7};
        int []arr4={3,4,7};

        boolean b1= Arrays.equals(arr1,arr2);
        boolean b2= Arrays.equals(arr1,arr3);
        boolean b3= Arrays.equals(arr2,arr3);
        boolean b4= Arrays.equals(arr3,arr4);

        System.out.println(b1+ " , " + b2 + ", "+ b3+ " , "+ b4);

        // only condition that arrays will be equal is if both array equal with value and order

        Arrays.sort(arr1); //arr1={3,5,7};
        Arrays.sort(arr2); //arr2={5,3,7};
        Arrays.sort(arr3);// arr3={3,5,7};
        Arrays.sort(arr4); // rr4={3,4,7};

        boolean b11= Arrays.equals(arr1,arr2); //t
        boolean b21=Arrays.equals(arr1,arr3); //true
        boolean b31= Arrays.equals(arr2,arr3); //t
        boolean b41= Arrays.equals(arr3,arr4); //false

        System.out.println(b11 + " , " + b21 + " , "+b31 + " , "+b41);

    }
}
