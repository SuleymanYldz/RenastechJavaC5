package PracticeGeneral;

public class TypeCasting {

    public static void main(String[] args) {

        String str=new String("Hello");
        Integer myInt=new Integer(10);

        int i1=myInt; // unboxing

        Character myCh='w';// autoboxing
        char ch2=myCh; // unboxing

        System.out.println("myCh = " + myCh);
        System.out.println("ch2 = " + ch2);

        int number=100; //prim

        Integer myInt5=number; // autoboxing


    }
}
