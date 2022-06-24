package Assignments;

public class Cat2 {

    public static void main(String[] args) {

        cat cat=new cat();
        cat.SetCatInfo("Margaret ", "Brown", 3.0);
        System.out.println(cat);
        cat.sleep();
       cat.eat();
       cat.drink();

    }
}
