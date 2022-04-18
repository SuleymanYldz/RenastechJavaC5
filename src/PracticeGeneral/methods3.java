package PracticeGeneral;

public class methods3 {

    public static void main(String[] args) {
        hello();
        hello();
        evenNumbers(0,200);
        evenNumbers(0,20);

        System.out.println("--------------------------------------");
        AgeCategory(24);
        AgeCategory(55);
        AgeCategory(17);
        AgeCategory(256);
        AgeCategory(5);
        AgeCategory(43);
        AgeCategory(-25);

    }

    public static void hello(){

        System.out.println("hello");
    }

    public static void evenNumbers(int startingPoint, int endingPoint){

        for (int i =startingPoint; i <=endingPoint; i++) {
            if (i%2==0){
                System.out.println(i + " is even number");
            }

        }
    }
    public static void AgeCategory(int age){

        String result="";

        if (age>=0&& age<=5){
            result=age+ " is a baby ";

        }else if (age >5 && age <=18){
            result=age+ " is a young";

        }else if (age >18 && age <=80){
            result=age + " is mature";

        }else if (age >80){
            result = age+ " is old";

        }else {
            result = age+ " is not exsist";
        }
        System.out.println(result);


    }
}
