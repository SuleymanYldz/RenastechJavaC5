package PracticeGeneral;

import java.util.ArrayList;

public class ListPractice3 {


    public static void main(String [] args){

        ArrayList<Integer>number=new ArrayList<>();

        number.add(7);
        number.add(14);
        number.add(21);
        number.add(28);

        int min=number.get(0);

        for (int i = 0; i <number.size()-1 ; i++) {
            if (number.get(i)<min){
                min=number.get(i);
            }

        }
        System.out.println(min);
    }
}
