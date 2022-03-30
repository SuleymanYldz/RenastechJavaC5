package StudySession.Session1;

public class reverseanInt {

    public static void main(String[] args) {


        int number=52;

        int answerOfInt=0;

        while (number !=0){


            int remaindeOf10= number %10;

            answerOfInt =answerOfInt * 10 + remaindeOf10;

            number /=10;

        }

        System.out.println(answerOfInt);

    }
}
