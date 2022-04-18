package PracticeGeneral;

public class metdos2 {

    public static void main(String[] args) {

        evenNumber();
    }

    public static void evenNumber(){

        int number = 100;
        System.out.println("List of  even Number from 1 to 100" + number);
        for (int i = 2; i <=number ; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
    }
}
