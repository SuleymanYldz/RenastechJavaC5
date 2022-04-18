package PracticeGeneral;

public class methodOperators {

    public static void main(String[] args) {

        Operator(200,100,'+');
        MultiplyOperator(15,3, 'x');
        DivisionOperator(856,8, '/');


    }
    public static void Operator( int number1, int number2, char result){

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
