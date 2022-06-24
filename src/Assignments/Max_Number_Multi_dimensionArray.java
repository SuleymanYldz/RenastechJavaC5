package Assignments;

public class Max_Number_Multi_dimensionArray {

    ////    (Array) Find Maximum
//    Write a program that can find the maximum number from a multi-dimension int Array
//
    //int [][] list2={{38,-90,0},{5,800,4}};
    public static void main(String[] args) {


        int [][] list2={{38,-90,0},{5,800,4}};

        int maxNumber=list2[0][2];

        System.out.println(list2.length);

        for (int i = 0; i <list2.length ; i++) {

            for (int j = 0; j <list2[i].length ; j++) {

                if (list2[i][j]>maxNumber){
                    maxNumber=list2[i][j];
                }

            }

        }

        System.out.println(" max is : " + maxNumber);
    }

}
