package StudySession.Session1;

public interface sumOfFirst20number {

    /**
     *   Write a program to calculate the sum of first 20 natural number.
     *  0+1+2+3+4+5+6+... 20 = ?
     *
     */


    public static void main(String[] args) {



        //We will create for loop
        //Create a varibale to store dat
        int sum=0;

        //Starting point , ending point
        for (int i=0; i<=8; i++){

            System.out.println("i equals to >>>>> " + i); // i=1; i=2, i=3+1; i=4; i=5 , i=6

            sum +=i;  //sum = 0+0=0,   0+1= 1, 1 +2= sum >> 3,  3+=3==> sum=6, 6+4= 10 , 10+5== 15+6=21

            System.out.println("Sum is >>>>>" + sum);

            System.out.println("****************************************");

        }


    }

}
