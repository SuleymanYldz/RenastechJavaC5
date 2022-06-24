package PracticeGeneral;

public class ParseMethod {

    //	methods:
//            parse methods: converts string of text to the primitives, returns primitive values
//            "123"
//
//            valueOf methods: converting string to wrapper class value, returns wrapper class values

    public static void main(String [] args){

        String number="123456";
        System.out.println(number +50);

        String str2="5.55";
        float f1=Float.parseFloat(str2);
        double d1=Double.parseDouble(str2);
        System.out.println(f1 +2.5);
        System.out.println(d1+2.5);

    }
}
