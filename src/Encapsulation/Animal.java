package Encapsulation;

public class Animal{

    private  String  name;
    private  int age;
    private  String color;


    public void setName(String name){
       this.name=name;
    }
    public void setAge(int age){
        this.age=age;

    }
    public void setColor(String color){
        this.color=color;

    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return  age;
    }
    public  String getColor(){
        return color;
    }
    public String toString(){
        return name+ " is "+ age+ "  years old"+ " "+ color;
    }
}

