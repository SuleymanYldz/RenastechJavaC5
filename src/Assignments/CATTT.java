package Assignments;

public class CATTT {


    String name;
    String color;
    double age;

    String setName(String name){
        this.name=name;
        return name;

    }
    String setColor(String color){
        this.color=color;
        return color;
    }
    Double setAge(double age){
        this.age=age;
        return age;
    }
    void sleep(){
        System.out.println(name + " is sleeping now");
    }
    void eat(String food){
        System.out.println(name + " is eating " + food);
    }
    void drink(){

        System.out.println(name + " is drink");
    }
    public String toString(){

        return "NAme is " +name + "Age is " + age + " Color is " + color;
    }
}
