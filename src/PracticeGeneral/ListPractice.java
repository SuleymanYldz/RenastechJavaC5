package PracticeGeneral;

import java.util.ArrayList;

public class ListPractice {

    //create an list of Integers
    //add 4 numbers
    //return maximumnumber
    
    public static void main(String []args){

        ArrayList<Integer>numbers=new ArrayList<>();
        
        numbers.add(15);
        numbers.add(30);
        numbers.add(45);
        numbers.add(60);

       int max= numbers.get(0);

        for (int i = 0; i <numbers.size() ; i++) {

            if (numbers.get(i)>max){
                max=numbers.get(i);
            }

        }
        System.out.println("Maximum Value is : " +max);

    }
}
