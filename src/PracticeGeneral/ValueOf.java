package PracticeGeneral;

public class ValueOf {

    public static void main (String []args){

        String str="55";

        Integer number=Integer.valueOf(str);
        int number2=Integer.parseInt(str);

        System.out.println(number+ 5);
        System.out.println(number2+ 5);
        System.out.println(str + 25);

    }
}
