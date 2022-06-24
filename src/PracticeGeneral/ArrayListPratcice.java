package PracticeGeneral;

import Encapsulation.Animal;

import java.util.ArrayList;

public class ArrayListPratcice {

    public static void main(String[] args) {

        ArrayList<String>animals=new ArrayList<>();
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Snake");
        animals.add("cat");
        animals.add("Dog");

        for (int i = 0; i <animals.size() ; i++) {
            System.out.println(animals.get(i));

        }
        System.out.println("Each Loop");

        for (String each:animals){
            System.out.println(each);
        }
    }
}
