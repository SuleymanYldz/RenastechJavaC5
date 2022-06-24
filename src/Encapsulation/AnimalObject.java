package Encapsulation;

public class AnimalObject  {

    public static void main(String[] args) {

        Animal cat=new Animal();
        cat.setName("Margaret");
        cat.setAge(3);
        cat.setColor("brown");
        System.out.println("cat.getAge() = " + cat.getAge());
        System.out.println("cat.getName() = " + cat.getName());
        System.out.println("cat = " + cat);

        System.out.println("***************************************************");

        Animal dog=new Animal();
        dog.setName("Judy");
        dog.setColor("White");
        dog.setAge(10);

        System.out.println("dog.getColor() = " + dog.getColor());
        System.out.println("dog.getName() = " + dog.getName());
        System.out.println("dog.getAge() = " + dog.getAge());
        System.out.println("dog = " + dog);
    }
}
