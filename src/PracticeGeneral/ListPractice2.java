package PracticeGeneral;

import java.util.ArrayList;

public class ListPractice2 {

    public static void main(String []args){

        ArrayList<Integer>number=new ArrayList<>();
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);

        //Max  Number


        int max=number.get(0);
        for (int i = 0; i <number.size() ; i++) {
            if (number.get(i)>max){
                max=number.get(i);
            }

        }
        System.out.println(max);
    }
}
