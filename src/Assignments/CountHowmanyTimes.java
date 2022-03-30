package Assignments;

public class CountHowmanyTimes {

    public static void main(String[] args) {

        String mystring="java is fun, but sometimes java is pain.Love java java java";

        int lastindex=mystring.length()-1;
        int count=0;
        char a='a';

        for (int i = 0; i <=lastindex ; i++) {
            if (a==mystring.charAt(i)){
                count++;

            }

        }
        System.out.println(count);

        System.out.println("**********************");

        int number=1;
        while (number < 99){

            if (number %3==0 && number %4==0){
                System.out.println(number);
            }
            number++;

        }
        System.out.println("*******************************");

        String name="Suleyman";

        int lastIndex=name.length()-1;
        String reverse= " ";

        while (lastIndex>=0){
            reverse+=name.charAt(lastIndex);
            lastIndex--;

        }
        System.out.println(reverse);
    }
}
