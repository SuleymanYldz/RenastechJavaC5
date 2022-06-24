package Assignments;

import java.util.ArrayList;

public class ShoeObject {


    public static void main(String[] args) {

        Shoe object1=new Shoe();
        System.out.println(object1.brand);
        System.out.println(object1.size);
        System.out.println(object1.color);

        object1.wear();
        object1.getShoeInfo();

        System.out.println("-----------------------------------");

        Shoe shoe1=new Shoe();
        shoe1.brand="Reebook";
        shoe1.size=9;
        shoe1.color="Blue";

        System.out.println("shoe1.brand = " + shoe1.brand);
        System.out.println(shoe1.size);
        System.out.println(shoe1.color);
        shoe1.wear();
        shoe1.getShoeInfo();

        System.out.println("***********************************");

        Shoe shoe2=new Shoe();

        shoe2.brand="Adidas";
        shoe2.size=18;
        shoe2.color="White";
        System.out.println(shoe2.brand);
        System.out.println( shoe2.color);
        shoe2.getShoeInfo();

        System.out.println("**********************************");

        Shoe []shoes={shoe1,shoe2};

        shoes[0].getShoeInfo();
        shoes[1].getShoeInfo();

        ArrayList<Shoe>shoesList=new ArrayList<>();

        shoesList.add(shoe1);
        shoesList.add(shoe2);

        System.out.println(shoesList.get(0).color);
        System.out.println(shoesList.get(0).size);
        System.out.println(shoesList.get(0).brand);

        System.out.println("--------------------------------");

        System.out.println(shoesList.get(1));

    }
}
