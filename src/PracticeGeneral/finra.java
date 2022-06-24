package PracticeGeneral;

public class finra {

    public static void main(String[] args) {

        for (int i = 1; i <=30 ; i++) {
            if (i % 3 ==0){

                if (i % 5==0 && i %3==0){
                    System.out.println( i +"FINRA");
                }
                else if (i % 5==0){
                    System.out.println(i +"FIN");
                }
                else {
                    System.out.println(i + "RA");
                }
            }
        }
    }
}
