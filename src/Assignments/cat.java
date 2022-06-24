package Assignments;

public class cat {

    /*
    cat class:
   data/attributes: instance variables
    name, color, age
   actions: instance methods
    sleep(), eat(), drink() , move()
    bird class
     data/attributes: instance variables
    name, color, age
   actions: instance methods
    sleep(), eat(), drink() ,fly()
     */


    String name;
    String color;
    double age;

    public void SetCatInfo( String name, String color, double age){

        this.name=name;
        this.color=color;
        this.age=age;
    }

    public void sleep(){

        System.out.println(name + " is sleeping all day");
    }
    public void eat(){

        System.out.println(name + " is eating Pizza");
    }
    public void drink(){

        System.out.println(name + " is drinking pepsi");
    }
    public  void move(){

        System.out.println(name + " is moving");
    }
    public String toString(){

        return  "Cat name is " + name + " Cat color is " + color + " Cat age is :" + age;
    }

}
