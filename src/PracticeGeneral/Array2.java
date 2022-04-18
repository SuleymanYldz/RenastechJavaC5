package PracticeGeneral;

public class Array2 {

    public static void main(String[] args) {

        int [] numberList={1,2,45,67,8,10,500,2,40};

        for (int i = 0; i <=numberList.length-1 ; i++) {
            if (numberList[i] %2==0){
                System.out.println(numberList[i] +  " is even number");
            }

        }
        // min and mx numbers

        int [] numberList2={1,2,45,67,8,10,500,2,40,-900};

        // max=500;
        //min =1;
        int max= numberList2[0];
        int min=numberList2[0];



        for (int i = 0; i <=numberList2.length -1; i++) {
            if (numberList2[i] > max){
                max=numberList2[i];
            }

            if (numberList2[i] < min){
                min=numberList2[i];

            }

        }
        System.out.println(max);
        System.out.println(min);

    }
}
