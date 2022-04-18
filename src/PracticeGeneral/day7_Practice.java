package PracticeGeneral;

public class day7_Practice {

    public static void main(String[] args) {


        String personName=" Ben";
        int age=33;
        double weight=53.3;
        String result="";


        if (age>18){
            if (weight>50.0){
                result=personName+ " is eligible to give blood ";
            }else {
                result= personName + " is not eligible to give blood";
            }

        }else if (age >0 && age<=18){
            result=personName+ "is needs to be older 18 ";
        }else {
            result= " invalid age you entered" + age;
        }
        System.out.println(result);
        System.out.println("------------------------------------");


    }
}
