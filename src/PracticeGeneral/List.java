package PracticeGeneral;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {


        ArrayList<Integer>number=new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        System.out.println(number);

        System.out.println(number.get(3));

        ArrayList<String>words=new ArrayList<>();

        words.add("suleyman");
        words.add("Tuba");
        words.add("Nisa");
        words.add("Tulay");

        System.out.println(words);

        for (int i = 0; i <= words.size()-1 ; i++) {
            System.out.println("words.get("+i+") = " + words.get(i));
        }
    }
}
