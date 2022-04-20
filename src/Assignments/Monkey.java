package Assignments;

public class Monkey {
    public static void main(String[] args) {
        System.out.println(monkey(true, true));
        System.out.println(monkey(false,false));
        System.out.println(monkey(false,true));

    }

    public static boolean monkey (boolean aSmile , boolean bSmile){

        boolean result=true;

        if (aSmile== bSmile){
            result= true;
        }else {
            result =false;
        }
        return result;
    }
}
