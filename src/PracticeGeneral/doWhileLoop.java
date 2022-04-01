package PracticeGeneral;

public class doWhileLoop {

    public static void main(String[] args) {

        int number=25;

        while (number < 25){
            System.out.println("While loop");
        }
        do {
            System.out.println("do While");
        } while (number <25);
     //   do {
       //     System.out.println("hello");
      //  }while (number==25);

        System.out.println("***********************************");

        int number1=8;

        do {
            System.out.println("number1 = " + number1);
            number1++;

        }while (number1 <10);

        System.out.println("***********************************");

        int number3=10;

        do {
            System.out.println(number3);
            number1--;
        }while (number3 < 0);

        System.out.println("************************************");
         int count =0;
         int number4=0;

         do {
             if (number4 % 2 == 0) {
                 count++;
                 System.out.print(number4 + " , ");
             }

             number4++;
         }while (number4 <= 100);
        System.out.println();

        System.out.println(count);

        System.out.println("**************************");

        int a=30;
        while (a <5){
            System.out.println("While loop");
        }
        do {
            System.out.println("do While");
        }while (a < 5);
 //       do {
   //         System.out.println("HElloo");
   //     }while (a==30);

        System.out.println("**************************************");

        int b=3;
        do {

            System.out.println("b = " + b);
            b++;

        }while (b < 10);

        System.out.println("***************************");

        int c=5;


        do {
            System.out.println(c);
            c--;
        }while (c <0);

        System.out.println("********************");

        int d=0;

        do {
            if (d % 2==0){
                count++;
                System.out.print(d + " , ");
            }
            d++;
        }while (d<=100);

        System.out.println();
        System.out.println(count);

        System.out.println("************************");

        int number0=9;

        do {
            System.out.println(" 9 is my favourite number");

        }while (number0 % 2==0 && number0 % 3==0);
        System.out.println("even number");


        System.out.println("*******************************");

        int numbers=15;


        do {
            System.out.println(numbers);
        }while (numbers % 3==0);
        System.out.println("Hello");

        System.out.println("******************");

        int num=0;
    //    do {
      //      System.out.println("Suleyman");
            num++;

     //  }while (num <=20);

      //  System.out.println();

        System.out.println("*************");

        int input=0;
        int count1=0;

        do {

            if (input % 2==0){
                count1++;
                System.out.print(input + " , ");
            }

            input++;
        }while (input <=100);
        System.out.println();

        System.out.println(count1);
    }

}
