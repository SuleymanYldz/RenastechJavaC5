package Encapsulation;

public class HumanObject {

    public static void main(String[] args) {

        Human human=new Human();
        human.setAge(24);
        human.setName("Suleyman");
        human.setNationality("Turkey");
        System.out.println("human = " + human);
    }
}
