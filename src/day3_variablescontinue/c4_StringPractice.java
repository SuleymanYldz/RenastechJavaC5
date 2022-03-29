package day3_variablescontinue;

public class c4_StringPractice {

    //  create 3 name and assign any name  ex: Firat Hatice Abe
    //  create 3 age assign any number you want to   ex : 20 30 40
    //  print those age with person name   ex : Abe age is : 20
    //  also sum those three person age  ex : 20 + 30 + 40
    //  print  "Sum of persons Age = 90 ;

    public static void main(String[] args) {

        //  create 3 name and assign any name
        String s1= "Bailey";
        String s2= "Suleyman";
        String s3= "Judy";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


        //  create 3 age assign any number you want to
        int i1= 20;
        int i2= 24;
        int i3= 4;


        //  print those age with person name
        System.out.println("bailey age is 20");
        System.out.println("suleyman age is 24");
        System.out.println("judy age is 4");

        System.out.println(i1+i2+i3);
        System.out.println("Sum of person age= " + (i1+i2+i3));
    }
}
