package Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class removeArrayLIst {


    public static void main(String[] args) {


        ArrayList<String> names=new ArrayList<>((Arrays.asList("Suleyman","Suleyman","Suleyman","Nisa","Virginia")));

        names.removeAll(Arrays.asList("Suleyman"));

        System.out.println(names);


        ArrayList<String>name=new ArrayList<>();

        name.addAll(Arrays.asList("Virginia","Virginia","Virginia","Gaziantep","Urfa"));

        name.remove(0);
        System.out.println(name);

        name.removeAll(Arrays.asList("Virginia"));

        System.out.println("name = " + name);
    }
}
