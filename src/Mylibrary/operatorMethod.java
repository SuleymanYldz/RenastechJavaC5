package Mylibrary;

public class operatorMethod {

    public static void main(String[] args) {

        AdditionOperator(200,100,'+');
        MultiplyOperator(15,3,'x');
        DivisionOperator(986,8,'/');


    }
    public static void AdditionOperator( int number1, int number2, char result){

        if (result=='+'){
            System.out.println(number1+number2);
        }
    }
    public static void MultiplyOperator(int num1, int num2, char answer ){

        if (answer=='x'){
            System.out.println(num1*num2);
        }
    }

    public  static void DivisionOperator(int x, int y, char res){

        if (res=='/'){
            System.out.println(x / y);
        }
    }
}
