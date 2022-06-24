package PracticeGeneral;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();

        numbers.addAll(Arrays.asList(10,50,-12,5000,9874,-986,150,63,-50,500));
        System.out.println("numbers = " + numbers);

        int number=0;

      for (Integer each: numbers){
          System.out.println(number + " index of "+ each);

          number++;

      }

    }
}
