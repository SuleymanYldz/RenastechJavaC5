package Assignments;

public class AnimalsObjects {

    public static void main(String[] args) {


        Animals animal=new Animals();

        animal.setAnimalInfo("Cat",3,"Brown","Margaret");
        System.out.println("animal.name = " + animal.name);
        System.out.println("animal.type = " + animal.type);
        System.out.println(animal);

        Animals animals2=new Animals();

        animals2.setAnimalInfo("Dog",10,"White","Judy");

        System.out.println(animals2.color);
        System.out.println("animals2.age = " + animals2.age);
        System.out.println("animals2.name = " + animals2.name);
    }
}
