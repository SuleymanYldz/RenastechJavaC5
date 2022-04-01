package PracticeGeneral;

public class Nestedloop {

    public static void main(String[] args) {

        for (int i =0; i < 3; i++) {
            System.out.println("Java");

            for (int j = 1; j < 5; j++) {
                System.out.println("Python");
            }
        }
        System.out.println("*******************");

        for (int i = 1; i <4 ; i++) {
            System.out.println("PArents loop start point");
            for (int k = 3; k < 6; k++) {
                System.out.println("child loop is running i is " + i + " k is " + k) ;
            }

            System.out.println("PArent loop end");

        }
    }
}
