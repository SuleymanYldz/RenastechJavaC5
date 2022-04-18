package PracticeGeneral;

public class Switch3Practice {

    public static void main(String[] args) {

        char letter='c';
        String result= "Hello";

        switch (letter){
            case 'a':
                result+=" a";

                break;
            case 'b':
                result+= "b";

                break;
            case 'c':
                result+= " c";

                break;

            default:
                result+= " invalid";

        }
        System.out.println(result);
    }
}
