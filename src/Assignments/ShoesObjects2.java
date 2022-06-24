package Assignments;

public class ShoesObjects2 {

    public static void main(String[] args) {

        Shoe shoe1=new Shoe();

        shoe1.brand="Red";
        shoe1.size=14;
        shoe1.color="Nike";

        System.out.println(shoe1);

        Shoe shoe2=new Shoe();

        shoe2.setShoeInfo("Gucci",11,"White");
        System.out.println(shoe2);

        Shoe shoe3=new Shoe();

        shoe3.setShoeInfo("Puma",7,"Black");
        System.out.println(shoe3);
        System.out.println("shoe3.color = " + shoe3.color);
        System.out.println("shoe3.size = " + shoe3.size);
    }
}
