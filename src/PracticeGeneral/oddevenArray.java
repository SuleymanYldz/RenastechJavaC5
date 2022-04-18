package PracticeGeneral;

public class oddevenArray {

    public static void main(String[] args) {


        int [][] number2D={
                {1,2,3,4},
                {5,6,7,25},
                {8,9,10,11,55}
        };
        int countOdd=0;
        int countEven=0;
        int sumEven=0;
        int sumOdd=0;

        for (int[] each1D: number2D){
        for (int eachNumber: each1D){
            if (eachNumber % 2 == 0) {
                System.out.println(eachNumber + " is even Number");
                countEven++;
                sumEven+=eachNumber;

            }else {
                System.out.println(eachNumber + " is Odd Number");
                countOdd++;
                sumOdd+=eachNumber;
            }

        }
        }
        System.out.println("countEven ="+ countEven);
        System.out.println("coutnOdd = " + countOdd);
        System.out.println(sumOdd);
        System.out.println(sumEven);
    }
}
