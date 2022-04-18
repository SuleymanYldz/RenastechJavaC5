package PracticeGeneral;

public class Findunique {

    public static void main(String[] args) {


        String words="A,A,B,C,C";

        String result=" ";

        for (int i = 0; i < words.length(); i++) {
            int count=0;
            for (int j = 0; j < words.length(); j++) {
                if (words.charAt(i)== words.charAt(j)){
                    count++;
                }

            }
            if (count==1){
                result+=words.charAt(i);
            }

        }
        System.out.println(result);
    }
}
